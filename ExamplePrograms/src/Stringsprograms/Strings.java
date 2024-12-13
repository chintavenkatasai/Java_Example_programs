package Stringsprograms;

import java.util.StringTokenizer;

public class Strings 
{
	static void pro1()
	{
	//	miracle software
   //   elcarim erawtfos
			StringTokenizer s = new StringTokenizer("miracle software systems");
			while(s.hasMoreElements())
			{
				String temp = s.nextToken();
				for(int i=temp.length()-1;i>=0;i--)
				{
					System.out.print(temp.charAt(i));
				}
				System.out.print(" ");
			}
	}
	static void pro2()
	{
	
		int arr[] = {6,34,345,28};
		int count;
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=1;j<arr[i];j++)
			{				
				if(arr[i]%j==0)
				{
					sum=sum+j;
				}
			}
			//System.out.println(sum);
			if(sum==arr[i]) {
				System.out.println(arr[i]+" is perfect");
			}
		}
	}
	public static void pro3()
	{
		int count=5;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	public static void pro4()
	{
		double tot=0;
		
		for(int i=1;i<=3;i++)
		{
			double sum=0;
			int fact=1;
			for(int j=i;j>=1;j--)
			{
			fact=fact*j;
			}
			sum=1/(Math.pow(i,fact));
			tot=tot+sum;
		}
		System.out.println(tot);
		
	}
public static void main(String[] args) 
{
  
  pro1();
  pro2();
  pro3();
  pro4();
 
}
}