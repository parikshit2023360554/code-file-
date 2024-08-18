import java.util.*;

class array
{
	public static void main(String arg[])
	{
		System.out.println("enter the no of row and column");
		Scanner scan= new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] data = new int[row][column];
		System.out.println("enter the numbers");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				data[i][j]=scan.nextInt();
			}
		}
		System.out.println("printing array........");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}


	}
}
