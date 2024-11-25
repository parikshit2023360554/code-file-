// exception handling : numberFormatException & ArithmeticException  

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
            String a1 = s.next();
            String b2 = s.next();
            int a = Integer.parseInt(a1);
            int b = Integer.parseInt(b2);
            int c = a / b;
            System.out.println("Output" + c);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Output:" +e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Output:" +e);
        }
    }
}
