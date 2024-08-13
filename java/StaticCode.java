import java.util.Scanner;
public class StaticCode {
    static int num1 , num2;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
    }
    public static int nonPrime(){
        int sum =0 ;
        for(int i=num1;i<num2;i++){
            int prime = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime = 1;
                    break;

                }
            }
            if(prime==0){
                sum = sum+i;
            }
            
        }
        return sum ;
    }

    static void printData(int sum)
    {
        System.out.println("the sum is:"+sum);
    }

    public static void main(String args [])
    {
        StaticCode sc = new StaticCode();
        sc.getData();
        int s = nonPrime();
        printData(s);


    }
}