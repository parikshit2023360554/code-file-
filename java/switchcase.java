import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first no");
        int first_var= scan.nextInt();
        System.out.println("enter the second no");
        int sec_var=scan.nextInt();
        int i=1;
        while(i!=0){
            System.out.println("please choose");
            System.out.println("1: ADD ");
            System.out.println("2: sub");
            System.out.println("3: multi");
            System.out.println("4: div");
            System.out.println("5: update");
            System.out.println("6:End ");
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
                case 5:{
                    System.out.println("enter again the first no");
                    int update_var= scan.nextInt();
                    first_var=update_var;
                    System.out.println("enter again the second element");
                    int secupdate_var= scan.nextInt();
                    sec_var=secupdate_var;
                    break;
                }
                case 6:{
                    System.out.println("Thank you succesfully ended,,,,,,,,,,");
                    i=0;
                }
                default:{
                    System.out.println("invalid option");
                
                }
            }
        }
    }
}
