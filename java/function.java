import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name="Welcome to the function");
        return;
    }

    public static int calculateSum(int firstVal, int secVal){
        int sum=firstVal+secVal;
        return sum;
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        printMyName(name);
        System.out.println("enter your first element");
        System.out.println("enter your sec element");
        int firstVal=scan.nextInt();
        int secVal =scan.nextInt();

        int sum= calculateSum(firstVal, secVal);
        System.out.println("the sum is "+sum);

    }
}
