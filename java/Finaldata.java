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


  //creating dispaly method in both the class
  public void dispaly(){
    System.out.println("i will m1 display");
  }
}


class Finaldata1 extends Finaldata{
	public void m2(){
		System.out.println("i am in second class");
	}

  //this display method will run because it is present in the main class where the object is created
  public void dispaly(){
    System.out.println("i will run m2 dispaly");
  }
  public static void main(String args[]){
		Finaldata1 obj = new Finaldata1();
    //the value of the x will be constant and cannot be change due to final
    final int x = 10;
    //x++;//error we cannot change the value of the x
    System.out.println("x = "+x);
    obj.m1();
    obj.m2();
    obj.dispaly();
  }
}
