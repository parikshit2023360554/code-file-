import java.util.*;
class subway{
  public static int countArr(int[] arr){
    int maxtill = arr[0];
    int currentMax= arr[0];
    for(int i = 1 ; i<arr.length ; i++){
      currentMax = Math.max(arr[i],currentMax + arr[i]);
      maxtill = Math.max(maxtill , currentMax);
    }
    return maxtill;
  }


  public static void main(String args[]){
    System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();


		int[] arr= new int[size];
    System.out.println("enter the no to add in array");
		for(int i=0; i<size; i++)
		{

			arr[i]= sc.nextInt();
		}
    int getno = countArr(arr);
    System.out.println(getno);
  }
}
