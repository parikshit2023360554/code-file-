// create a class student with data member sid , sname , sadd , and create two function
//  getdata() and putdata(). write a program to store the detail of 10 student and initialize 
//  the values  

import java.util.Scanner;
public class student {
    int sid ; 
    String sname ; 
    String sadd ; 

    public student(int sid , String sname , String sadd){
        this.sid = sid ; 
        this.sname = sname ; 
        this.sadd = sadd ; 
    }
    

    public static student getdata(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the student id");
        int sid =scan.nextInt();
        scan.nextLine();

        System.out.println("enter the name of the student");
        String sname = scan.nextLine();
        scan.nextLine();

        System.out.println("enter the address of the student");
        String sadd = scan.nextLine();
        scan.nextLine();

        return new student(sid, sname, sadd);
    }

    public void putdata(){
        System.out.println("the details of the student is ----------");
        System.out.println("ID-- "+sid);
        System.out.println("NAME-- "+sname);
        System.out.println("ADDRESS-- "+sadd);

    }
    

    public static void main(String args []){
        student[] students = new student[2];
        for(int i =0 ; i<students.length; i++){
            students[i]= student.getdata();
        }
        System.out.println("detail of the student are");
        for(int i =0 ; i<students.length; i++){
            students[i].putdata();
        }

        



    }
}
