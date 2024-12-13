package Basicprograms;

import java.util.Scanner;

public class LeapyearorNot 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year :");
int year = sc.nextInt();

if((year%400==0)&&(year!=100)||(year%4==0))
{
	System.out.println("The given Year is Leap Year :"+year);
}
else
{
	System.out.println("The given year is not Leap year :"+year);
}
}
}
