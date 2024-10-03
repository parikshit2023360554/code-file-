import java.util.Scanner;

class palindrome{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word to check");
        String check = scan.nextLine();
        if(checkPalindrome(check)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }


    public static boolean checkPalindrome(String str){
        int left = 0; 
        int right = str.length() -1 ; 
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--; 
        }
        return true;
        
    }
}
