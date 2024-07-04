import  java.util.*;

public class loop_in{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of element you want add");
        int no_element=scan.nextInt();
        int sum =0 ;
        for(int i=0; i<no_element;i++){
            System.out.println("enter the "+(i+1)+"element");
            int element=scan.nextInt();
            sum = element+sum;
        }            
        System.out.println("the total sum is "+sum);
        }
        

}
