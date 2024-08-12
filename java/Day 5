import java.util.*;

class check
{
	static int a,b;
	public void getData()
	{
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter the two no ");
		a = scan.nextInt();
		b = scan.nextInt();
	}

	public static int nonPrime()
	{
		int sum = 0 ;
		for(int n=a;n<=b;n++)
		{
			int prime = 0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					prime=1 ;
					break;
				}
			}
			if(prime==0)
			{
				System.out.print(n+"");
				sum=sum+n;
			}
		}
		return sum;
	}
	static void printSumNonPrime(int sum)
	{
		System.out.println("sum of all prime : " + sum );
	}
	public static void main(String args[])
	{
		nonPrime obj = new nonPrime();
		obj.getData();
		int s = nonPrime();	
		printSumNonPrime(s);
	}
}
	
	
