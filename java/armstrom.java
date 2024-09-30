import java.util.Scanner;

public class ArmstrongNumber {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int numDigits = String.valueOf(number).length();

        // Loop through each digit and sum the power of digits
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numDigits);
            number /= 10;
        }

        // Return true if result equals the original number
        return result == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is Armstrong and print the result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
