import java.util.Scanner;

public class palindrome {
    
    // Method 1: Using two pointers
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method 2: Using StringBuilder reverse
    public static boolean isPalindromeUsingStringBuilder(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanStr);
        return cleanStr.equals(sb.reverse().toString());
    }
    
    // Method 3: Recursive approach
    public static boolean isPalindromeRecursive(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(cleanStr, 0, cleanStr.length() - 1);
    }
    
    private static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        return isPalindromeHelper(str, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        System.out.println("\nInput: " + input);
        System.out.println("Length: " + input.length());
        
        // Test all three methods
        boolean result1 = isPalindrome(input);
        boolean result2 = isPalindromeUsingStringBuilder(input);
        boolean result3 = isPalindromeRecursive(input);
        
        System.out.println("\nResults:");
        System.out.println("Method 1 (Two Pointers): " + (result1 ? "PALINDROME" : "NOT A PALINDROME"));
        System.out.println("Method 2 (StringBuilder): " + (result2 ? "PALINDROME" : "NOT A PALINDROME"));
        System.out.println("Method 3 (Recursive): " + (result3 ? "PALINDROME" : "NOT A PALINDROME"));
        
        // Test with some examples
        System.out.println("\n=== Test Examples ===");
        String[] examples = {
            "racecar",
            "A man a plan a canal Panama",
            "Was it a car or a cat I saw?",
            "hello world",
            "12321",
            "Madam, I'm Adam",
            "Never odd or even"
        };
        
        for (String example : examples) {
            boolean isPal = isPalindrome(example);
            System.out.println("\"" + example + "\" -> " + (isPal ? "PALINDROME" : "NOT A PALINDROME"));
        }
        
        scanner.close();
    }
}
