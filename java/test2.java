

public class test2{
    public static int position(char ch) { 
        return Character.toLowerCase(ch) - 'a' + 1 ; 
    }

    public static int sum(String word){

        int length = word.length();
        int sum = 0 ; 
        for(int i =0 ; i<length /2 ; i++){
            int diff = Math.abs(position(word.charAt(i))-position(word.charAt(length -i - 1)));
            sum += diff ; 
        }
        if(length%2==1){
            sum += position(word.charAt(length/2));
        }

        return sum ; 
    }

    public static String spliting(String sentance){
        String[] words = sentance.split(" "); 
        StringBuilder result = new StringBuilder(); 

        for(String word : words){
            result.append(sum(word));
        }
        return result.toString();
    }

     public static void main(String[] args) {
        String sentence = "WORLD WIDE WEB" ; 
        System.out.println(spliting(sentence));
     }
}