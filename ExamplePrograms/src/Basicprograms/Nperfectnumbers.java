package Basicprograms;

import java.util.Scanner;

public class Nperfectnumbers 
{
public static void main(String[] args) {
//	System.out.println("Printing perfect numbers:");
//	for(int i=1;i<=100000;i++)
//	{
//		if(isperfect(i))
//		{
//			System.out.println(i);
//		}
//	}
//}	
//public static boolean isperfect(int n)
//{
//	int sum=0;
//	for(int i=1;i<=n/2;i++)
//	{
//		if(n%i==0)
//		{
//			sum=sum+i;
//		}
//	}
//	return sum==n;
	
	int sum1=0,count=0;
	for(int i=1;i<=10000;i++)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
			  	sum=sum+j;
			}
}   
		if(sum==i)
		{
			System.out.println("The perfect numbers are: "+sum);
			count++;
		}
		if((count<=10)&&(sum==i))
		{
			sum1=sum1+i;
		}
	}
	System.out.println("10 perfect numbers are: "+sum1);
}
}