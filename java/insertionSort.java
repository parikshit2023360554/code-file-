import java.util.Scanner;
class insertionSort{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the element of the array");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }

    for(int k=1;k<size;k++){
      int current=arr[k];
      int j = k-1;
      while(j>=0 && current<arr[k]){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=current;
    }
    printArray(arr);
  }

public static void printArray(int aray[]){
    for(int i=0;i<aray.length;i++)
    {
        System.out.print(aray[i]+" ");
    }
    System.out.println();
}
}
