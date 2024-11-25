/*
inheritance :
which a child class inherit the property and methord of parent class

>>> single level
>>> hierarchial inheritance
>>> multi level inheritance
>>> hybrid inheritance
>>> multiple inheritrance (not possible directly and possible with the help of interface)

oops -> inheritance -> multiple -> interface -> abstract class -> adstract method

what is interface
if we want want to give a multiple inheritance to java class it will give error to make it possible we use
interface in java to give a multiple inheritance to a single class
defination ========>
it is just like a adstract class in which all the method are by default abstract and all the data member
 are static and final by default
 */
/*
class -> class  : extends
interface -> class : impliment
interface -> interface : extends
*/

// =============================================code===============================================================
interface first
{
  public void m1();
}
interface second
{
  public void m2();
}
class Third implements  first , second{
  public void m1(){
    System.out.println("i am into m1 method");
  }
  public void m2(){
    System.out.println("i am into second method");
  }
  public static void main(String args[]){
    Third sc = new Third();
    sc.m1();
    sc.m2();
  }
}





// single level
//  class first{
//    public void m1(){
//      System.out.println("Base class ")
//    }
//  }
//  class second extends first {
//    public void m2(){
//      System.out.println("derived class");
//    }
//
//    public static void main(String args[]){
//      second sc = new second();
//      sc.m1();
//      sc.m2();
//    }
//  }







//multilevel inheritance

// class first{
//   public void m2(){
//     System.out.println("first class");
//   }
// }
// class second extends first{
//   public void m3(){
//     System.out.println("second");
//   }
//
// }
// class third extends second{
//   public void m4(){
//     System.out.println("third");
//   }
//
//   public static void main(String args []){
//     third sc = new third();
//     sc.m2();
//     sc.m3();
//     sc.m4();
//   }
// }
