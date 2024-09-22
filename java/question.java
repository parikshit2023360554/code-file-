
// construct a class bank where data will be account no coustomer name and balance.use display() 
// methord to print all theinformation of the particulart customer whose balance is less than 5000
class Bank{
    int accountNO;
    String customerName ; 
    double balance;

    public Bank(int accountNO, String customerName , double  balance){
        this.accountNO = accountNO;
        this.customerName = customerName; 
        this.balance =balance; 
    }

    public void display(){
        if(balance<5000){
            System.out.print("account no " + accountNO);
            System.out.print("CustomerName"+ customerName);
            System.out.print("balance"+ balance);
        }
        System.out.println(" ");
    }

    public static void main(String args[]){
        Bank account1 = new Bank(101, "John Doe", 4500);
        Bank account2 = new Bank(102, "Jane Smith", 7000);
        Bank account3 = new Bank(103, "Alice Johnson", 3000);
        Bank account4 = new Bank(104, "John lknsvne", 500);
        account1.display();
        account2.display();
        account3.display();
        account4.display();
        
    }

}