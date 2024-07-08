import java.util.*;
public class functionIntro {
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

        //caling print function
        printMyName(name);


        System.out.println("enter your first element");
        int firstVal=scan.nextInt();

        System.out.println("enter your sec element");
        int secVal =scan.nextInt();
               
        //storing the return value of the calculate in sum 

        int sum= calculateSum(firstVal, secVal);
        System.out.println("the sum is "+sum);

    }
}
