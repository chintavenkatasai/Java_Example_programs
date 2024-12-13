package Basicprograms;

import java.util.Scanner;

public class Divisible3and5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();		
	if((n%3==0)&&(n%5==0))
	{
		System.out.println("The given number is divisible by 3&5 :"+n);
	}
	else
	{
		System.out.println("The given number is not divisible by 3&5 :"+n);
	}
	}

}
