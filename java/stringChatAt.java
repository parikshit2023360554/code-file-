import java.util.*;
class stringChatAt
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine();


		// charAt function work accoding index 
		// the data will print as per index 
		for(int i=0;i<line1.length();i++)
		{	
			System.out.println(line1.charAt(i));
		}
		for(int i=0;i<line1.length();i++)
		{	
			System.out.print(line1.charAt(i));
		}

	}
}