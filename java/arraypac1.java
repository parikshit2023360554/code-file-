import java.util.*;

class arraypac1
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
		int sum =0 ;

		for(int i=0;i<size;i++)
		{
			sum = sum+number[i];
		}
		System.out.println("the sum of the element of the array is "+sum);
	}
}
