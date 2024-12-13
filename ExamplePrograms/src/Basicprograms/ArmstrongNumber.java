package Basicprograms;

import java.util.Scanner;

public class ArmstrongNumber 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int  n=sc.nextInt();
	int temp,Armstrong=0,count=0;
	int Original = n;
	int tempN = n; 
     while (tempN > 0) {
         tempN = tempN / 10;
         count++;
     }
     n = Original;
	while(n>0)
	{
		temp=n%10;
	    temp=(int) Math.pow(temp,count);
//   	temp = temp*temp*temp;
	    Armstrong=Armstrong+temp;
	    n=n/10;
	}
	if(Armstrong==Original)
	{
		System.out.println("The number is Armstrong number");
	}
	else
	{
		System.out.println("The number is  Not Armstrong number");
	}
	sc.close();
//	for(int i=1;i<=100;i++)
//	{
//		temp=n%10;
//		temp=temp*temp*temp;
//		Armstrong=Armstrong+temp;
//		n=n/10;
//	}
//	if(Armstrong==Original)
//	{
//		System.out.println(Original);
//	}
}
}
