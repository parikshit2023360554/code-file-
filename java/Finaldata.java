// FINAL DATA
// final is a keyword which make the variable constant
//      Final class
//            we can not inherit the data by making new class by existing class
//            we can not overide and data cannot be change

//     Program 12


class Finaldata{
  public void m1(){
    System.out.println("i am in  first class");

  }
}
class Finaldata1 extends Finaldata{
  public void m2(){
    System.out.println("i am in second class");
  }

  public static void main(String args[])
  {
    Finaldata1 obc = new Finaldata1();
    final int x =10 ;
    System.out.println(x);
    obc.m1();
    obc.m2();
  }
}
