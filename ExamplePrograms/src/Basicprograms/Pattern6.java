package Basicprograms;

public class Pattern6 
{
public static void main(String[] args) 
{
//	*
//	**
//	***
//	****
//	*****
//	******

//for(int i=1;i<=6;i++)
//{
//	for(int j=1;j<=i;j++)
//	{
//		System.out.print("*");
//	}
//	System.out.println();
//}
	
//	 65432
//	  6543
//	   654
//	    65
//	     6
//	for(int i=1;i<=6;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(" ");
//		}                                                           
//		for(int k=6;k>i;k--)
//		{
//			System.out.print(k+"");
//		}
//		System.out.println();
//	}
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
//	* * * * * * 

	
	for(int i=1;i<=6;i++)
	{
		for(int j=6;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
}
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *

//	for(int i=1;i<=5;i++)
//	{
//		for(int j=5;j>i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=(2*i-1);k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for(int i=5-1;i>=1;i--)
//	{
//		for(int j=5;j>i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=(2*i-1);k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
}
}
