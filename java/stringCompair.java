
import java.util.*;
class stingCompair
{
	 public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		if(line1.compareTo(line2)==0)
		{
			System.out.println("the line is equal ");
		}
		else
		{
			System.out.println("the line is not equal");
		}
	}
}	
