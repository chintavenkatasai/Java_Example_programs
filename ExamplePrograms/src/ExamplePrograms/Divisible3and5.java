package ExamplePrograms;

import java.util.Scanner;

public class Divisible3and5 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Value :");
int n = sc.nextInt();
if((n%3==0)&&(n%5==0)) 
{
	System.out.println("The Given Value is Divisible by both 3 and 5  :" +n);
		}
else
{
	System.out.println("The Given Value is NOt Divisible by both 3 and 5 :" +n);
}
}
}
