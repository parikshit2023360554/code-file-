
import java.util.*;

class firstclass{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        //OUTPUT IN JAVA 

        System.out.print("hello worl");
        System.out.println("hello i am using the java");


        //INPUT IN JAVA 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        // String age = sc.nextInt();
        System.out.println(name);
        Scanner sr = new Scanner(System.in);
        System.out.println("enter the age");
        int a= sr.nextInt();
        // using nextline to use string and int into a same scanner class
        sr.nextLine();
        String b = sr.next();
        System.out.println("string is " + b);
        System.out.println("the "+name+" age is "+a);



    }
}