import java.util.Scanner;
class fibonacciRecurtion{
  public static void fibonacci(int first , int sec , int till){
    if(till==0){
      return;
    }
    int third = first + sec ;
    System.out.println(third);
    fibonacci(sec,third,till-1);

  }
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int till = scan.nextInt();
    int first = 0 ;
    int second = 1 ;
    System.out.println(first);
    System.out.println(second);
    fibonacci(first,second,till-2);
  }
}
