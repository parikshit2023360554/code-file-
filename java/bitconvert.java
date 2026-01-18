import java.util.*;

class bitconvert {
    public static void main(String args[]) {
        binarytobit();
    }

    public void binarytobit(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scan.nextInt();
        
        StringBuffer binary = new StringBuffer();
        int temp = decimal;
        
        while (temp > 0) {
            binary.append(temp % 2);  
            temp = temp / 2;         
        }
        
        binary.reverse();
        System.out.println(binary);
    }


    public void bittobinary(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter binary");
        String binary = scan.nextLine();

        for(int  )
    }
}