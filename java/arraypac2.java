import java.util.*;

class arraypac2
{
	public static void main(String arg[])
	{
		System.out.println("enter the no of size");
		Scanner scan= new Scanner(System.in);
		int size = scan.nextInt();
		int[] number = new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<size;i++)
		{
			number[i]= scan.nextInt();
		}
		System.out.println("enter the no to search");
		int num_search = scan.nextInt();
		System.out.println("Searching.......");
		
		for(int i=0;i<size;i++)
		{
			if(num_search==number[i])
			{
				System.out.println("number found....");
				System.out.println("the no is at index---"+ i);
			}
		}
	}
}
