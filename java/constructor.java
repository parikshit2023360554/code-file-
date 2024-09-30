

// default constructor 
//  it is constructor with no parameter , if you do not provide any constructor in your class  
// java automatically provide a default constructor

class constructor{
    int num;

    public  constructor(){
        num = 10 ; 
        System.out.println(num);
    }
}

class Main{
    public static void main(String args[]){
        constructor scan = new constructor();
    }
        
}