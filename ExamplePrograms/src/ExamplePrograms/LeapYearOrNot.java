package ExamplePrograms;

import java.util.Scanner;

public class LeapYearOrNot 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Year :");
int ye =sc.nextInt();
if((ye%4==0)&&(ye!=100)||(ye%400==0))
{
	System.out.println("The Given Year is Leap year :"+ye);
}
else
{
	System.out.println("The Given Year is Not a Leap year :"+ye);
}
}
}
