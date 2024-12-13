package Basicprograms;

public class Pattern5 
{
public static void main(String[] args) 
{
//	A  
//	A  B  
//	A  B  C  
//	A  B  C  D  
//	A  B  C  D  E  
//	A  B  C  D  E  F  
//	A  B  C  D  E  F  G  

for(int i=0;i<=6;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print((char)('A' +j) + "  ");
	}
	System.out.println();
}
//	A B C D E F 
//	A B C D E 
//	A B C D 
//	A B C 
//	A B 
//	A 
//
//	
//	for(int i=6;i>=1;i--)
//	{
//		for(int j=0;j<i;j++)
//		{
//			System.out.print((char)('A' +j)+ " ");
//		}
//		System.out.println();
//	}
	
//	*2*
//	**3**
//	***4***
//	****5****
//	*****6*****
//	******7******
//
//	for(int i=1;i<=7;i++)
//	{
//		for(int j=1;j<i;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.print(i);
//	
//	for(int j=1;j<i;j++)
//	{
//	System.out.print("*");
//	}
//	System.out.println();
//}
	
////	******1
//	*****12
//	****123
//	***1234
//	**12345
//	*123456
//	1234567
//
//	for(int i=1;i<=7;i++)
//	{
//		for(int j=7;j>i;j--)
//		{
//			System.out.print("*");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print(k);
//		}
//		System.out.println();
//	}
//	*7654321
//	**654321
//	***54321
//	****4321
//	*****321
//	******21
//	*******1
//	for(int i=7;i>=1;i--)
//	{
//		for(int j=i;j<=7;j++)
//		{
//			System.out.print("*");
//		}
//		for(int k=i;k>=1;k--)
//		{
//			System.out.print(k);
//		}
//		System.out.println();
//	}
}
}