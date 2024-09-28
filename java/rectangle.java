
import java.util.Scanner;
class rectangle{
    int side1;
    int side2 ; 
    int side3; 
    int height;


    // public rectangle(){
    //     this.side1 = side1 ; 
    //     this.side2 = side2 ; 
    //     this.side3 = side3;
    //     this.height= height;
    // }


    public void getdata(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the side1");
        int side1 = scan.nextInt();
        System.out.println("enter the side2");
        int side2 = scan.nextInt();
        System.out.println("enter the side3");
        int side3 = scan.nextInt();
        System.out.println("enter the height");
        int height = scan.nextInt();
    }

    public void claculateArea(){
        double area = 0.5*side3*height;
        System.out.println("the Area is---"+area);
    }

    public void claculateperimeter(){
        double perimeter = side1+side2+side3;
        System.out.println("the perimeter of the rectangle is ------ "+perimeter);
    }

    public static void main(String[] args) {
        rectangle sc = new rectangle();
        sc.getdata();
        sc.claculateArea();
        sc.claculateperimeter();
    }
}