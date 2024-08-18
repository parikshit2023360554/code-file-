import java.util.Scanner;
class slectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();

        //inilizing the array

        int[] arr = new int[size];
        System.out.println("enter the element of the array");

        //taking user input

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<size-1;j++){
            int smallest = j;
            for(int k=j+1;k<size;k++){
                if(arr[smallest]>arr[k]){
                    smallest=k;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[j];
            arr[j]= temp;
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