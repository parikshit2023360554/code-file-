import java.util.*;
class array
{
	public static void main(String args[])
	{
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in); 
		int size = sc.nextInt();                     //size of the array 
		

		int[] marks= new int[size];                 //declaring the array
		for(int i=0; i<size; i++)
		{
			System.out.println("enter the no to add in array");
			int input=sc.nextInt();
			marks[i]=input;
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(marks[i]+",");      //displaying the number in array
		}

	}
}
		