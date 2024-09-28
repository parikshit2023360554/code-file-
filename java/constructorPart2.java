public class constructorPart2 {
    int num ; 
    public constructorPart2(int num){
        this.num = num ; 
        System.out.println(this.num);
    }
    
}

class Main2{
    public static void main(String args [])
    {
        constructorPart2 scan = new constructorPart2(10);
    }
}
