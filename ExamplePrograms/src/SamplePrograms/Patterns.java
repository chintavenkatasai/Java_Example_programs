package SamplePrograms;

public class Patterns 
{
public static void main(String[] args) 
{
//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 
//	A B C D 
//	A B C 
//	A B 
//	A 

//for(int i=0;i<=4;i++)
//{
//	for(int j=0;j<=i;j++)
//	{	
//		char ch=(char)('A'+j);
//		System.out.print(ch+" ");
//	}
//	System.out.println();
//}
//	for(int k=3;k>=0;k--)
//	{
//		for(int s=0;s<=k;s++)
//		{
//	     char ch=(char)('A'+s);
//			System.out.print(ch+" ");
//		}
//		System.out.println();
//	}
//	    1* 
//	   2* 2* 
//	  3* 3* 3* 
//	 4* 4* 4* 4* 

//	for(int i=1;i<=4;i++)
//	{
//		for(int j=4;j>=i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print(i+"* ");
//		}
//		System.out.println();
//	}
	for(int i=1;i<=1;i++)
	{
		for(int j=1;j<=1;j++)
		{
			System.out.print(i+"*");
		}
		System.out.println();
	}
	for(int i=1;i<=2;i++)
	{
		for(int j=1;j<=2;j++)
		{
			System.out.print(i+"*");
		}
		System.out.println();
	}
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=3;j++)
		{
			System.out.print(i+"*");
		}
		System.out.println();
	}
}
}


