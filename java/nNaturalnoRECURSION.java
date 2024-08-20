//write a java code to print the sum of n natural no using recursion


import java.util.Scanner;
class nNaturalnoRECURSION{
  public static void printSum(int till , int i,int sum){
    if(i==till){
      sum+=i;
      System.out.println(sum);
      return;
    }
    sum+=i;
    i++;
    printSum(till,i,sum);
  }
  public static void main(String Args []){
    System.out.println("enter the no to sum till");
    Scanner scan = new Scanner(System.in);
    int till = scan.nextInt();
    int i=0;
    int sum =0;
    printSum(till,i,sum);
  }
}
