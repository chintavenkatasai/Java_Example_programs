package ExamplePrograms;

import java.util.Scanner;

public class EvenOrOdd 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number :");
int num = sc.nextInt();
if(num%2==0)
{
	System.out.println("The Given Number is Even :"+num);
}
else
{
	System.out.println("The Given Number is Odd :"+num);
}
}
}
