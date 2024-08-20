import java.util.Scanner;
class factorialRecursion{
  public static int calFactorial(int n){
    if(n==1 || n==0){
      return 1;
    }
    int fact_nm1 = calFactorial(n-1);
    int fact_n = n * fact_nm1;
    return fact_n;
  }
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the no till you want to find the recursion");
    int till = scan.nextInt();
    int fact=calFactorial(till);
    System.out.println(fact);
  }
}
