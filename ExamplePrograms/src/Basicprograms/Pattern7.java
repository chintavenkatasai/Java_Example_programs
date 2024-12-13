package Basicprograms;

public class Pattern7 
{
public static void main(String[] args) 
{
//	1
//	10
//	101
//	1010
//	10101

//for(int i=1;i<=5;i++)
//{
//	 StringBuilder line = new StringBuilder();
//	for(int j=0;j<i;j++)
//	{
//		 line.append((j % 2 == 0) ? '1' : '0');
//	}
//	System.out.println(line.toString());
//}
//    1 
//  2 1 2 
//3 2 1 2 3 
//4 3 2 1 2 3 4 
//
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=i;j<=5;j++)
//		{
//			System.out.print("  ");
//		}
//		for(int k=i;k>=1;k--)
//		{
//			System.out.print(k+" ");
//		}
//		for(int j=2;j<=i;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
//	1 2 3 4 
//	 2 3 4 
//	  3 4 
//	   4 
//	  3 4 
//	 2 3 4 
//	1 2 3 4 
//
//	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=4;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
			
	}
	for(int i=4-1;i>=1;i--)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=4;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
//	}
//	1
//	1*2
//	1*2*3
//	1*2*3*4
//	1*2*3*4*5
//	1*2*3*4*5*6
//	1*2*3*4*5*6*7

//	for(int i=1;i<=7;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			if(j==i)
//			{
//			System.out.print(j);
//			}
//			else {
//				System.out.print(j+ "*");
//			}
//		}
//		System.out.println();
//	}
}
}
}
