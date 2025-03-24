import java.lang.Math;
class area
{
	public static void main(String args[])
	{
		double r = 36.6025;
		double d = 0.150;
		for(int i=0;i<41;i++)
		{

			double c=d*i;
			double f=r-c*c;
			//System.out.println("inner square = "+f);
			//System.out.println("distance =  "+c);
			double chord = 2 * Math.sqrt(f);
			System.out.println("chord "+i+"=  "+ chord);
			System.out.println("");
		}
	}
}
