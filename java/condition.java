import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first no");
        int first_iteg = scan.nextInt();
        System.out.println("enter the second no");
        int sec_iteg = scan.nextInt();
        if(first_iteg==sec_iteg){
            System.out.println("the no is equal");
        }else{
            if(first_iteg>sec_iteg){
                System.out.println(first_iteg+" is greater");
            }
            if(sec_iteg>first_iteg){
                System.out.println(sec_iteg+" is greater");
            }

        }
        //using else if conditon 
        if(first_iteg%2==0){
            System.out.println(first_iteg+" is an even");
        }
        else if (first_iteg==0) {
            System.out.println("it is null");
        }
        else{
            System.out.println(first_iteg+"it is odd");
        }
    }
}
