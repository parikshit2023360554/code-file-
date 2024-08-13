import java.util.Scanner;
public class linear {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element");
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to search");
        int sea  = sc.nextInt();
        for(int z=0; z<size;z++){
            System.out.print(" "+arr[z]);
            System.err.println("");
            if(arr[z]==sea){
                System.out.println("the element is present in "+z);
                break;
            }
        }
    }
}
