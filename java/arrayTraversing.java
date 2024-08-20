import java.util.Scanner;
class arr{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i=0 ; i<n;i++){
      arr[i]=scan.nextInt();
    }
    printArr(arr,n);
  }

  public static void printArr(int arr[],int n){
    for(int i =0 ; i<n;i++){
      System.out.print(" "+arr[i]);
    }
  }
}
