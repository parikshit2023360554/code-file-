import java.util.*;

public class ques1 {
    public static void main(String args [] ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> marks = new ArrayList<>();
        for(int i=0;i<n;i++){
            int ma = sc.nextInt();
            marks.add(ma);
        }
        // List<Integer> block1 = new ArrayList<>();
        // List<Integer> block2 = new ArrayList<>();
        // List<Integer> block3 = new ArrayList<>();

        // for(int num : marks){
        //     if(num<40){
        //         block1.add(num);
        //     }else if(num>=40 & num<=74){
        //         block2.add(num);
        //     }else{
        //         block3.add(num);
        //     }
        // }


        // List<Integer> f = new ArrayList<>();
        // for(int mark:block1){
        //     f.add(mark);
        // }
        //  for(int mark:block2){
        //     f.add(mark);
        // }
        //  for(int mark:block3){
        //     f.add(mark);
        // }
        // System.out.println(f);

        marks.sort((a,b) -> {
            int groupa = a<40 ?0:a<=74?1:2;
            int groupb = a<40 ?0:a<=74?1:2;
            return Integer.compare(groupa, groupb);



        });
        System.out.println(marks);
        






        sc.close();
    }
    
}
