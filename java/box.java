// design a class box with instance variable length , width , and height of double type , two 
// function() SetDimension() and showDimension() and default and parameterized constructor. create 
// two object of box class and set and show the dimension of both objects
import java.util.Scanner;
public class box{
    double length;
    double width ;
    double height; 

    public box(double length , double width , double height){
        this.length = length ; 
        this.width = width ; 
        this.height = height ; 
    }

    public void setDimension(double length , double width , double height){

        this.length = length ;
        this.width = width ; 
        this.height = height ; 

    }

    // public double getHeight(){
    //     return height; 
    // }
    // public double getWidth(){
    //     return width ; 
    // }
    // public double getLength(){
    //     return length ; 
    // }

    public  void showDimension(){
        System.out.println("Dimention............");
        System.out.println("lenght--" + length);
        System.out.println("widht--" + width);
        System.out.println("height--"+ height);
    }
        
    }

    
class SecondBox{
    public static void main(String arg []){
        box sc = new box(10.7,20.1,90.1);
        sc.showDimension();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("enter the height , weight and length");
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        System.out.println("dimetion after update is ---------------");
        sc.setDimension(length, width, height);
        sc.showDimension();

    }
}