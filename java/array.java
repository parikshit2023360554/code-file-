// collection of similar data type is called array
// and it is stored in continuous location in a memory
// in the array the variable itself is a ponter
// types of Array - Single dimentional                                 int a[]={1,2,3,4,5}
//                - multi dimentional 																	[]-dimention
// 																																			{}-cointains the element
//  class, interface, enum, or record expected

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
			marks[i]= sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(marks[i]+",");      //displaying the number in array
		}

	}
}
