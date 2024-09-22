//  build a program to display odd and even number form 1 to n where n=100 using class and
// object concept 


class evenOddUsingObject{
    public static void displayEven(int n){
        System.out.println("the even no are");
        for(int i=0 ;i<n;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
    }

    public static void displayOdd(int n){
        System.out.println("the odd no");
        for(int i=0 ; i<n ; i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
    }

    public static void main(String args[]){
        int n =100; 
        evenOddUsingObject sc = new evenOddUsingObject();
        sc.displayEven(n);
        sc.displayOdd(n);
    }
}