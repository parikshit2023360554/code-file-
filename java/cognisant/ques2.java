import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the no of student in one register");
        int no1 = sc.nextInt();


        System.out.println("enter the no of student in the second input");
        int no2 = sc.nextInt();


        List<Integer> att1 = new ArrayList<>();

        System.out.println("enter the entry of first data");

        for (int i = 0; i < no1; i++) {
            int data1 = sc.nextInt();
            att1.add(data1);
        }

        List<Integer> att2 = new ArrayList<>();

        System.out.println("enter the entry of second data");
        for (int i = 0; i < no2; i++) {
            int data2 = sc.nextInt();
            att2.add(data2);
        }
        List<Integer> result = new ArrayList<>();
        int i =0 ; int j =0 ; 
        while(i<att1.size() && j<att2.size()){
            if(att1.get(i)<=att2.get(j)){
                result.add(att1.get(i));
                i++;
            }else{
                result.add(att2.get(j));
                j++;
            }
        }

        while(i<att1.size()){
            result.add(att1.get(i));
            i++;
        }

        while(j<att2.size()){
            result.add(att2.get(j));
            j++;
        }

    
        
        System.out.println(att1);
        System.out.println(att2);

        System.out.println(result);
        sc.close();

    }
}
