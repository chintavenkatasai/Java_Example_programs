package Basicprograms;

import java.util.Scanner;

public class Happynumber 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();
while(num>9)
{
	int sum=0;
	while(num>0)
	{
		 int r=num%10;
		 sum=sum+r*r;
		 num=num/10;
	}
	num=sum;
}
if(num==1)
{
	System.out.println("The number is happy number" );
}
else
{
	System.out.println("The number is not a happy number");
}
}
}
