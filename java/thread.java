import java.util.Random ; 
class Square implements Runnable
{
    int n ; 
    Square(int rn){
        n=rn;
    }
    public void run(){
        if(n%2==0){
            System.out.println("random No :"+n);
            System.out.println("output: "+ n*n);
        }
    }
}

class Cube implements Runnable{
    int n ; 
    Cube(int rn){
        n=rn;
    }
    public void run(){
        if(n%2!=0){
            System.out.println("randon no  "+n);
            System.out.println("output  " + n*n);
        }
    }
}

class RandomNoSQ{
    public static void main(String args[]) throws  Exception{
        Random r = new Random();
        int rn = r.nextInt(15);
        Square s = new Square(rn);
        Cube c = new Cube(rn);
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

    }
}

