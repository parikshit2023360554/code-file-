import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques3 {

    public static int findfirst(List<Integer> arr , int k){

        int left = 0 ; 
        int right = arr.size()-1; 
        int result = -1; 
        while(left<=right){
            int mid = (left+right)/2;
            int midvalue = arr.get(mid);
            if(midvalue==k){
                result = mid;
                right = mid -1;

            }else if(midvalue<k){
                left = mid+1;
            }else{
                right = mid-1;

            }

        }
        return result;

    }

    public static int findlast(List<Integer> arr , int k){
         int left = 0 ; 
        int right = arr.size()-1; 
        int result = -1; 
        while(left<=right){
            int mid = (left+right)/2;
            int midvalue = arr.get(mid);
            if(midvalue==k){
                result = mid;
                left= mid +1;

            }else if(midvalue<k){
                left = mid+1;
            }else{
                right = mid-1;

            }

        }
        return result;

    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr.add(element);
        }
        System.out.println("enter the book to find");
        int K = sc.nextInt();

        int first = findfirst(arr, K);
        int last = findlast(arr, K);

        if(first==-1){
            System.out.println("{-1,-1}");
        }else{
            System.out.println(first + ","+last);
        }







        sc.close();
    }





}