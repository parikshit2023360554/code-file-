
import java.util.Scanner;
class largest{
    static int  large(int num1 , int num2 , int num3 ){
        if(num1>num2 && num1>num3){
            return num1; 
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        else{
            return num3;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int hello = large(num1,num2,num3);
        System.err.println(hello);

    }
}