public class permutation_Recurtion{
  public static void printPermu(String str , String permutation){
    if(str.length()==0){
      System.out.println(permutation);
    }
    for(int i=0;i<str.length();i++){
      char currentStr = str.charAt(i);
      String newStr = str.substring(0,i)+str.substring(i+1);
      printPermu(newStr,permutation+currentStr);
    }
  }

  public static void main(String args[]){
    String str = "abc";
    printPermu(str,"");
  }
}
