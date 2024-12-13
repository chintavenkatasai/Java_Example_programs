package Basicprograms;

import java.util.Scanner;

public class Biggestamoungtwonumbers 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number :");
int a = sc.nextInt();
System.out.println("Enter second number :");
int b =sc.nextInt();
if(a>b)
{
	System.out.println("The first number is biggest :"+a);
}
else
{
	System.out.println("The second number is biggest :"+b);
}
}
}
