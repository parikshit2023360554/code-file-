class exception{
    public static void main(String[] args){
        try {
            int output = divide(10,0);
        } 
        catch (ArithmeticException e){
            System.out.println("Caught an Exception:"+ e.getMessage());
        }
        finally{
            System.out.println("this block always executed");
        }
        
    }

    public static int divide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cannot devide by 0");
        }
        return a/b;
    }
}