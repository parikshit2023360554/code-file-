import javax.swing.*;

public class DivisionApp {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Num1:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Num2:"));
            JOptionPane.showMessageDialog(null, "Result: " + (num1 / num2));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid number format.");
        }
    }
}