import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first no");
        int first_var= scan.nextInt();
        System.out.println("enter the second no");
        int sec_var=scan.nextInt();
        System.out.println("please choose");
        System.out.println("1: ADD 2: sub 3: multi 4: div");
        int button=scan.nextInt();
        switch(button){
            case 1:{
                System.out.println("you chose add pls wait ......");
                System.out.println(first_var+sec_var);
                break;
            }
            case 2:{
                System.out.println("you choose sub pls wait...");
                System.out.println(first_var-sec_var);
                break;
            }
            case 3:{
                System.out.println("you choose mult plss wait....");
                System.out.println(first_var*sec_var);
                break;
            }
            case 4:{
                System.out.println("ypu choose div plss wait....");
                System.out.println(first_var*sec_var);
                break;
            }
            default:{
                System.out.println("invalid option");
                
            }
        }
    }
}
