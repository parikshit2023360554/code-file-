
class demo
{
    void display(){
        System.out.println("without the static");
    }

    static void show(){
        System.out.println("With the static");
    }
}
public  class StaticExample{
    public static void main(String arg[]){
        

        //creating the object of demo class to call non static method
        demo sc = new demo();
        sc.display();
        demo.show();

    }

}