import java.util.*;
public class function1 {
    public static int sumvariable(int a,int b){
        int sum = a +b;
        return sum;
    }
    public static int subvariabe(int a ,int b ){
        int sub = a-b;
        return sub;
        

    }
    public static int multiply(int a , int b){
        int mul = a*b;
        return mul;


    }
    public static int divvariable(int a ,int b){
        int div = a/b;
        return div;

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first no");
        int a =scan.nextInt();
        System.out.println("enter your second no");
        int b = scan.nextInt();
        int i =1;
        while(i!=0){
        System.out.println("enter you option");
        System.out.println("1 : ADD ");
        System.out.println("2 : SUB");
        System.out.println("3 : MULTI");
        System.out.println("4 : DIV");
        System.out.println("5 : END");
        int button = scan.nextInt();
        switch(button){
            case 1:{
            int sum = sumvariable( a ,b);
            System.out.println("the sum is " + sum);
            break;
            }
            case 2:{
                int sub =subvariabe(a ,b );
                System.out.println("the sub is"+sub);
                break;
            }
            case 3:{
                int multi =multiply(a ,b);
                System.out.println("the multi is"+multi);
                break;
            }
            case 4:{
                int div = divvariable(a ,b);
                System.out.println("the div is"+div);
                break;
            }
            case 5:{
                System.out.println("You ended successfuly..........");
                i =0;
                break;
            }
        }

        }

    }
}
