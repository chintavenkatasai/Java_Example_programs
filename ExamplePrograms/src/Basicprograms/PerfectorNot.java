package Basicprograms;

import java.util.Scanner;

public class PerfectorNot 
{
public static void main(String[] args) 
{
	int num,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	num = sc.nextInt();
	
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
		if(sum==num)
		{
			System.out.println("The given number is perfect :"+sum);
		}
		else
		{
			System.out.println("The given number is not perfect :"+sum);
		}
	}

}
