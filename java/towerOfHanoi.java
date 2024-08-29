import java.util.Scanner;
class towerOfHanoi{
  public static void TOH(int n , String start , String help , String end){
    if(n==1){
      System.out.println("move "+n+" from "+start+ " to "+end);
      return;
    }
    TOH(n-1,start,end,help);
    System.out.println("move "+n+" from "+ start+ " to "+end);
    TOH(n-1,help,start,end);
  }qaa

  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of disk");
    int size = sc.nextInt();
    TOH(size,"A","B","C");
  }
}
