package Basicprograms;

import java.util.Scanner;

public class PositiveorNegative 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();
if(num>0)
{
	System.out.println("The given number is Positive :"+num);
}
else
{
	System.out.println("The given number is Negative :"+num);
}
}
}
