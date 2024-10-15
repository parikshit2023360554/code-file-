class method_overloading{
  public static void add(int a , int b){
    System.out.println(a+b);
  }
  public static void add(int a , int b , int c){
    System.out.println(a+b+c);
  }
}

class second{
  public static void main(String[] args) {
    method_overloading sc = new method_overloading();
    sc.add(1,2);
    sc.add(1,2,3);
  }
}
