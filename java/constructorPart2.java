//paramaterized constructor 
// allows you to pass a argument to the constructor when creating an object so that you can 
// initilize the object with your specific values

// the constructor  need not required any return statement a the object of the constructor is


public class constructorPart2 {
    int num ; 
    int start ; 
    public constructorPart2(int num , int start){
        this.num = num ; 
        this.start= start ; 
        System.out.println(this.num);
    }
    
}

class Main2{
    public static void main(String args [])
    {
        constructorPart2 scan = new constructorPart2(30,24);


    }
}
