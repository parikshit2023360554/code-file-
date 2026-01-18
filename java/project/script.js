// Sample product data
const products = [
    {
        id: 1,
        name: "Wireless Headphones",
        price: 99.99,
        description: "High-quality wireless headphones with noise cancellation",
        category: "Electronics",
        image: "🎧"
    },
    {
        id: 2,
        name: "Smart Watch",
        price: 199.99,
        description: "Feature-rich smartwatch with health monitoring",
        category: "Electronics",
        image: "⌚"
    },
    {
        id: 3,
        name: "Running Shoes",
        price: 79.99,
        description: "Comfortable running shoes for all terrains",
        category: "Fashion",
        image: "👟"
    },
    {
        id: 4,
        name: "Coffee Maker",
        price: 149.99,
        description: "Automatic coffee maker with timer",
        category: "Home & Living",
        image: "☕"
    },
    {
        id: 5,
        name: "Programming Book",
        price: 29.99,
        description: "Complete guide to modern programming",
        category: "Books",
        image: "📚"
    },
    {
        id: 6,
        name: "Yoga Mat",
        price: 39.99,
        description: "Premium yoga mat for home workouts",
        category: "Home & Living",
        image: "🧘"
    },
    {
        id: 7,
        name: "Bluetooth Speaker",
        price: 89.99,
        description: "Portable Bluetooth speaker with great sound",
        category: "Electronics",
        image: "🔊"
    },
    {
        id: 8,
        name: "Designer T-Shirt",
        price: 49.99,
        description: "Comfortable cotton t-shirt with unique design",
        category: "Fashion",
        image: "👕"
    }
];

// Shopping cart
let cart = [];
let cartTotal = 0;

// DOM elements
const productGrid = document.getElementById('productGrid');
const cartModal = document.getElementById('cartModal');
const cartItems = document.getElementById('cartItems');
const cartTotalElement = document.getElementById('cartTotal');
const cartCount = document.querySelector('.cart-count');
const searchInput = document.querySelector('.search-bar input');
const searchBtn = document.querySelector('.search-btn');
const hamburger = document.querySelector('.hamburger');
const navMenu = document.querySelector('.nav-menu');
const closeModal = document.querySelector('.close');
const cartIcon = document.querySelector('.cart-icon');

// Initialize the website
document.addEventListener('DOMContentLoaded', function() {
    displayProducts(products);
    setupEventListeners();
    updateCartCount();
});

// Setup event listeners
function setupEventListeners() {
    // Search functionality
    searchBtn.addEventListener('click', handleSearch);
    searchInput.addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            handleSearch();
        }
    });

    // Mobile menu toggle
    hamburger.addEventListener('click', toggleMobileMenu);

    // Cart modal
    cartIcon.addEventListener('click', openCartModal);
    closeModal.addEventListener('click', closeCartModal);
    window.addEventListener('click', function(e) {
        if (e.target === cartModal) {
            closeCartModal();
        }
    });

    // Smooth scrolling for navigation links
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            const target = document.querySelector(this.getAttribute('href'));
            if (target) {
                target.scrollIntoView({
                    behavior: 'smooth',
                    block: 'start'
                });
            }
        });
    });

    // Contact form submission
    document.querySelector('.contact-form').addEventListener('submit', handleContactForm);
}

// Display products
function displayProducts(productsToShow) {
    productGrid.innerHTML = '';
    
    productsToShow.forEach(product => {
        const productCard = createProductCard(product);
        productGrid.appendChild(productCard);
    });
}

// Create product card
function createProductCard(product) {
    const card = document.createElement('div');
    card.className = 'product-card';
    card.innerHTML = `
        <div class="product-image">
            ${product.image}
        </div>
        <div class="product-info">
            <h3 class="product-title">${product.name}</h3>
            <div class="product-price">$${product.price.toFixed(2)}</div>
            <p class="product-description">${product.description}</p>
            <button class="add-to-cart" onclick="addToCart(${product.id})">
                Add to Cart
            </button>
        </div>
    `;
    return card;
}

// Search functionality
function handleSearch() {
    const searchTerm = searchInput.value.toLowerCase().trim();
    
    if (searchTerm === '') {
        displayProducts(products);
        return;
    }
    
    const filteredProducts = products.filter(product => 
        product.name.toLowerCase().includes(searchTerm) ||
        product.description.toLowerCase().includes(searchTerm) ||
        product.category.toLowerCase().includes(searchTerm)
    );
    
    displayProducts(filteredProducts);
    
    // Show search results message
    if (filteredProducts.length === 0) {
        productGrid.innerHTML = `
            <div style="grid-column: 1/-1; text-align: center; padding: 2rem;">
                <h3>No products found for "${searchTerm}"</h3>
                <p>Try searching with different keywords</p>
            </div>
        `;
    }
}

// Add to cart functionality
function addToCart(productId) {
    const product = products.find(p => p.id === productId);
    
    if (product) {
        const existingItem = cart.find(item => item.id === productId);
        
        if (existingItem) {
            existingItem.quantity += 1;
        } else {
            cart.push({
                ...product,
                quantity: 1
            });
        }
        
        updateCartCount();
        updateCartTotal();
        showNotification(`${product.name} added to cart!`);
    }
}

// Update cart count
function updateCartCount() {
    const totalItems = cart.reduce((sum, item) => sum + item.quantity, 0);
    cartCount.textContent = totalItems;
}

// Update cart total
function updateCartTotal() {
    cartTotal = cart.reduce((sum, item) => sum + (item.price * item.quantity), 0);
    cartTotalElement.textContent = cartTotal.toFixed(2);
}

// Open cart modal
function openCartModal() {
    displayCartItems();
    cartModal.style.display = 'block';
    document.body.style.overflow = 'hidden';
}

// Close cart modal
function closeCartModal() {
    cartModal.style.display = 'none';
    document.body.style.overflow = 'auto';
}

// Display cart items
function displayCartItems() {
    if (cart.length === 0) {
        cartItems.innerHTML = '<p>Your cart is empty</p>';
        return;
    }
    
    cartItems.innerHTML = cart.map(item => `
        <div style="display: flex; justify-content: space-between; align-items: center; padding: 1rem; border-bottom: 1px solid #e9ecef;">
            <div>
                <h4>${item.name}</h4>
                <p>$${item.price.toFixed(2)} x ${item.quantity}</p>
            </div>
            <div style="display: flex; align-items: center; gap: 1rem;">
                <button onclick="updateQuantity(${item.id}, ${item.quantity - 1})" style="background: #e74c3c; color: white; border: none; padding: 0.5rem; border-radius: 50%; width: 30px; height: 30px; cursor: pointer;">-</button>
                <span>${item.quantity}</span>
                <button onclick="updateQuantity(${item.id}, ${item.quantity + 1})" style="background: #27ae60; color: white; border: none; padding: 0.5rem; border-radius: 50%; width: 30px; height: 30px; cursor: pointer;">+</button>
                <button onclick="removeFromCart(${item.id})" style="background: #e74c3c; color: white; border: none; padding: 0.5rem; border-radius: 5px; cursor: pointer;">Remove</button>
            </div>
        </div>
    `).join('');
}

// Update item quantity
function updateQuantity(productId, newQuantity) {
    if (newQuantity <= 0) {
        removeFromCart(productId);
        return;
    }
    
    const item = cart.find(item => item.id === productId);
    if (item) {
        item.quantity = newQuantity;
        updateCartCount();
        updateCartTotal();
        displayCartItems();
    }
}

// Remove from cart
function removeFromCart(productId) {
    cart = cart.filter(item => item.id !== productId);
    updateCartCount();
    updateCartTotal();
    displayCartItems();
}

// Toggle mobile menu
function toggleMobileMenu() {
    navMenu.classList.toggle('active');
}

// Show notification
function showNotification(message) {
    const notification = document.createElement('div');
    notification.style.cssText = `
        position: fixed;
        top: 100px;
        right: 20px;
        background: #27ae60;
        color: white;
        padding: 1rem 2rem;
        border-radius: 10px;
        box-shadow: 0 5px 15px rgba(0,0,0,0.3);
        z-index: 3000;
        animation: slideIn 0.3s ease;
    `;
    notification.textContent = message;
    
    document.body.appendChild(notification);
    
    setTimeout(() => {
        notification.style.animation = 'slideOut 0.3s ease';
        setTimeout(() => {
            document.body.removeChild(notification);
        }, 300);
    }, 2000);
}

// Handle contact form
function handleContactForm(e) {
    e.preventDefault();
    
    const formData = new FormData(e.target);
    const name = formData.get('name') || e.target.querySelector('input[type="text"]').value;
    const email = formData.get('email') || e.target.querySelector('input[type="email"]').value;
    const message = formData.get('message') || e.target.querySelector('textarea').value;
    
    if (name && email && message) {
        showNotification('Message sent successfully! We\'ll get back to you soon.');
        e.target.reset();
    } else {
        showNotification('Please fill in all fields.');
    }
}

// Add CSS animations for notifications
const style = document.createElement('style');
style.textContent = `
    @keyframes slideIn {
        from {
            transform: translateX(100%);
            opacity: 0;
        }
        to {
            transform: translateX(0);
            opacity: 1;
        }
    }
    
    @keyframes slideOut {
        from {
            transform: translateX(0);
            opacity: 1;
        }
        to {
            transform: translateX(100%);
            opacity: 0;
        }
    }
`;
document.head.appendChild(style);

// Filter products by category
function filterByCategory(category) {
    if (category === 'all') {
        displayProducts(products);
    } else {
        const filteredProducts = products.filter(product => product.category === category);
        displayProducts(filteredProducts);
    }
}

// Add category click functionality
document.addEventListener('DOMContentLoaded', function() {
    const categoryCards = document.querySelectorAll('.category-card');
    categoryCards.forEach(card => {
        card.addEventListener('click', function() {
            const categoryName = this.querySelector('h3').textContent;
            filterByCategory(categoryName);
            
            // Scroll to products section
            document.getElementById('products').scrollIntoView({
                behavior: 'smooth',
                block: 'start'
            });
        });
    });
});

// Add smooth scrolling for all internal links
document.addEventListener('DOMContentLoaded', function() {
    const links = document.querySelectorAll('a[href^="#"]');
    links.forEach(link => {
        link.addEventListener('click', function(e) {
            e.preventDefault();
            const targetId = this.getAttribute('href');
            const targetSection = document.querySelector(targetId);
            
            if (targetSection) {
                const headerHeight = document.querySelector('.header').offsetHeight;
                const targetPosition = targetSection.offsetTop - headerHeight;
                
                window.scrollTo({
                    top: targetPosition,
                    behavior: 'smooth'
                });
            }
        });
    });
});

// Add loading animation for products
function showLoading() {
    productGrid.innerHTML = `
        <div style="grid-column: 1/-1; text-align: center; padding: 2rem;">
            <div style="width: 50px; height: 50px; border: 5px solid #f3f3f3; border-top: 5px solid #e74c3c; border-radius: 50%; animation: spin 1s linear infinite; margin: 0 auto;"></div>
            <p>Loading products...</p>
        </div>
    `;
}

// Add CSS for loading animation
const loadingStyle = document.createElement('style');
loadingStyle.textContent = `
    @keyframes spin {
        0% { transform: rotate(0deg); }
        100% { transform: rotate(360deg); }
    }
`;
document.head.appendChild(loadingStyle);

// Simulate loading for better UX
function simulateLoading() {
    showLoading();
    setTimeout(() => {
        displayProducts(products);
    }, 1000);
}

// Initialize with loading effect
document.addEventListener('DOMContentLoaded', function() {
    simulateLoading();
});

// Add checkout functionality
document.addEventListener('DOMContentLoaded', function() {
    const checkoutBtn = document.querySelector('.checkout-btn');
    if (checkoutBtn) {
        checkoutBtn.addEventListener('click', function() {
            if (cart.length === 0) {
                showNotification('Your cart is empty!');
                return;
            }
            
            showNotification('Proceeding to checkout...');
            // Here you would typically redirect to a checkout page
            // or open a payment modal
            setTimeout(() => {
                closeCartModal();
                cart = [];
                updateCartCount();
                updateCartTotal();
                showNotification('Order placed successfully!');
            }, 2000);
        });
    }
});
