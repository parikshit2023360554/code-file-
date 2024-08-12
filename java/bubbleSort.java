import java.util.*;
class bubbleSort 
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scan.nextInt();
        
        int[] aray = new int[size];
        System.out.println("enter the element in th array");
        for(int i=0;i<size;i++)
        {
            aray[i] = scan.nextInt();
        }
        printArray(aray);

        for(int b=0;b<aray.length-1;b++)
        {
            for(int j=0;j<aray.length-b-1;j++)
            {
                if(aray[j]>aray[j+1])
                {
                    int temp = aray[j];
                    aray[j] = aray[j+1];
                    aray[j+1] = temp;

                }
            }
        }
        printArray(aray);
    }

    
    public static void printArray(int aray[]){
        for(int i=0;i<aray.length;i++)
        {
            System.out.print(aray[i]+" ");
        }
        System.out.println();
    }
}