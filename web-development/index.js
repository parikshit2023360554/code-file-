const labels = [];
const values = [];
let chart = null;

let totalBalance = 0;
let totalExpenses = 0;

// Array of colors for different items
const colors = [
  '#FF6384', '#36A2EB', '#FFCE56', '#4BC0C0', '#9966FF',
  '#FF9F40', '#66FF66', '#FF6666', '#66B2FF', '#FFB266'
];

// Function to add an item
function addItem() {
  const category = document.getElementById('category').value.trim();
  const amount = parseFloat(document.getElementById('amount').value);
  const totalAmount = parseFloat(document.getElementById('totalAmount').value);

  if (!category || isNaN(amount) || amount <= 0 || isNaN(totalAmount) || totalAmount <= 0) {
    alert("Please enter a valid category, amount, and total amount.");
    return;
  }

  // Update total balance
  totalBalance = totalAmount;

  // Check if the category already exists
  const existingIndex = labels.indexOf(category);
  if (existingIndex !== -1) {
    values[existingIndex] += amount;
  } else {
    labels.push(category);
    values.push(amount);
  }

  // Update the total expenses
  totalExpenses += amount;

  // Update UI elements
  updateCounters();
  updateTransactionList();
  updatePercentageList(totalBalance);
  updateChart(totalBalance);
  updateGraphItemSection(); // New function call for updating graph item section

  // Clear input fields and hide input area
  document.getElementById('category').value = '';
  document.getElementById('amount').value = '';
  document.querySelector('.input-area').classList.add('hidden');
}

// Function to update the counters in the dashboard
function updateCounters() {
  document.querySelector(".counter .totalbalance:nth-child(1) div:nth-child(2)").textContent = `Rs ${totalBalance.toFixed(2)}`;

  const totalSaving = totalBalance - totalExpenses;
  const savingPercentage = totalBalance > 0 ? ((totalSaving / totalBalance) * 100).toFixed(2) : 0;

  document.querySelector(".counter .totalbalance:nth-child(2) div:nth-child(2)").textContent = `Rs ${totalSaving.toFixed(2)}`;
  document.querySelector(".counter .totalbalance:nth-child(2) .balance-per").textContent = `${savingPercentage}%`;
}

// Function to update the transaction list
function updateTransactionList() {
  const transactionList = document.getElementById('transactionList');
  transactionList.innerHTML = '';

  labels.forEach((label, index) => {
    const amount = values[index];
    const transactionItem = document.createElement('div');
    transactionItem.classList.add('transaction3');
    transactionItem.innerHTML = `<a>${label}</a><a>₹${amount.toLocaleString('en-IN')}</a>`;
    transactionList.appendChild(transactionItem);
  });
}

// Function to update the percentage list next to the graph
function updatePercentageList(totalAmount) {
  const percentageInfo = document.getElementById('percentageInfo');
  percentageInfo.innerHTML = '';

  labels.forEach((label, index) => {
    const amount = values[index];
    const percentage = ((amount / totalAmount) * 100).toFixed(2);
    const listItem = document.createElement('li');
    listItem.textContent = `${label}: ${percentage}%`;
    percentageInfo.appendChild(listItem);
  });
}

// Function to update the "graph item" section with percentage
function updateGraphItemSection() {
  const graphItemSection = document.querySelector(".graph-item");
  graphItemSection.innerHTML = '';

  labels.forEach((label, index) => {
    const amount = values[index];
    const percentage = ((amount / totalExpenses) * 100).toFixed(2);
    const graphItem = document.createElement('div');
    graphItem.classList.add('graph-item');
    graphItem.innerHTML = `<a>${label}</a><a>${percentage}%</a>`;
    graphItemSection.appendChild(graphItem);
  });
}

// Function to update the chart
function updateChart(totalAmount) {
  const ctx = document.getElementById('expenseChart').getContext('2d');
  if (chart) chart.destroy();

  const percentages = values.map(value => (value / totalAmount) * 100);
  const chartColors = labels.map((_, index) => colors[index % colors.length]);

  const centerTextPlugin = {
    id: 'centerText',
    beforeDraw(chart) {
      const { width, height, ctx } = chart;
      ctx.save();
      ctx.font = '16px Arial';
      ctx.textAlign = 'center';
      ctx.textBaseline = 'middle';
      ctx.fillStyle = '#000';
      ctx.fillText(`Total: ₹${totalAmount.toLocaleString('en-IN')}`, width / 2, height / 2);
      ctx.restore();
    }
  };

  chart = new Chart(ctx, {
    type: 'doughnut',
    data: {
      labels: labels,
      datasets: [{
        label: 'Expense Distribution (%)',
        data: percentages,
        backgroundColor: chartColors
      }]
    },
    options: {
      responsive: true,
      plugins: {
        legend: { display: true },
        tooltip: {
          callbacks: {
            label: (context) => `${context.label}: ${context.raw.toFixed(2)}%`
          }
        }
      }
    },
    plugins: [centerTextPlugin]
  });
}

// Event listener for total amount input
document.getElementById("totalAmount").addEventListener("input", updateTotalBalance);

// Function to update the Total Balance when the user inputs it
function updateTotalBalance() {
  totalBalance = parseFloat(document.getElementById('totalAmount').value) || 0;
  updateCounters();
}

// Popup login functions
let loginForm = document.querySelector('.login-form');
let body = document.querySelector('.main-head');
let addArea = document.querySelector('.input-area');
let addButton = document.querySelector('.add');
let buttonItem = document.querySelector('.add-button');

function popuplogin() {
  body.classList.add('blur');
  loginForm.classList.remove('hidden');
  addArea.classList.add('blur');
  addButton.classList.add('blur');
}

function hidelogin() {
  body.classList.remove('blur');
  loginForm.classList.add('hidden');
  addArea.classList.remove('blur');
  addButton.classList.remove('blur');
}

// Function to display the input form
function displayInput() {
  addArea.classList.toggle('hidden');
  // body.classList.add('blur');

}


let username = document.getElementById("username")
let getname = document.getElementById("helpgetname")
username.innerText = "parikshit.."

