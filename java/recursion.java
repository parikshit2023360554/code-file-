import java.util.Scanner;
class recursion {
  public static void printInt(int n , int size){
    while(n==size+1){
      return;
    }
    System.out.println(n);

    //calling the funtion "printInt" in the function itself
    printInt(n+1,size);
  }

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the no till you want to print");
    int size = scan.nextInt();
    int z=1;
    printInt(z,size);
  }
}
