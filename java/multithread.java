

class multithreads extends Thread{
    public void run(){
        try{
            System.out.println("thread"+Thread.currentThread().getId()+" is running");
        }
        catch(Exception e){
            System.out.println("exception is called");
        }
    }
}

public class multithreaderror{
    public static void main(String[] args) {
        int n =8 ; 
        for (int i = 0; i < 10; i++) {
            multithreads object = new multithreads();
            object.start();
        }
    }
}