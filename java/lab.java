
// import java.util.Scanner; 
// public class lab {
//     public static int checkno(int n ){
//         if(n%2==0){
//             return 1 ;
//         }
//         else{
//             return 0 ;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int give = scan.nextInt();
//         int get = checkno(give);
//         System.out.println(get);

//     }
// }



// public class lab{
//     public static void main(String args []){
//         String  alfa = "nsijgnisgsnsvnksnv";
//         System.out.println(countalfa(alfa));
//     }

//     public static char countalfa(String alfa){
//         StringBuffer tb = new StringBuffer(alfa);
//         int[] frequency = new int[256];
//         for(int i=0 ; i<tb.length();i++){
//             frequency[tb.charAt(i)]++;
//         } 
            
//         int maxfreq = 0 ; 
//         char maxchar = ' ';
//         for(int i =0 ; i<frequency.length;i++){
//             if(frequency[i]>maxfreq){
//                 maxfreq = frequency[i];
//                 maxchar = (char) i;
//             }

//         }
//         return maxchar;
 
//     }
// }



// public class lab{
//     public static char checkthechar(String str){
//         int[] chararr = new int[256];

//         for(char c : str.toCharArray()){
//             chararr[c]++;
//         }


//         for(char c : str.toCharArray()){
//             if(chararr[c] == 1){
//                 return c ;
//             }
//         }
//         return '\0' ;
//     }

//     public static void main(String[] args) {
//         String input = "aaaaashjhjhj";
//         char result = checkthechar(input);
//         if(result != '\0'){
//             System.out.println("first non repeated char   ----   "+result);
//         }
//         else{
//             System.out.println("no char found");       
//         }
//     }
// }





import java.util.Random ; 
class Square implements Runnable
{
    int n ; 
    Square(int rn){
        n=rn;
    }
    public void run(){
        if(n%2==0){
            System.out.println("random No :"+n);
            System.out.println("output: "+ n*n);
        }
    }
}

class Cube implements Runnable{
    int n ; 
    Cube(int rn){
        n=rn;
    }
    public void run(){
        if(n%2!=0){
            System.out.println("randon no  "+n);
            System.out.println("output  " + n*n);
        }
    }
}

class RandomNoSQ{
    public static void main(String args[]) throws  Exception{
        Random r = new Random();
        int rn = r.nextInt(15);
        Square s = new Square(rn);
        Cube c = new Cube(rn);
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

    }
}


