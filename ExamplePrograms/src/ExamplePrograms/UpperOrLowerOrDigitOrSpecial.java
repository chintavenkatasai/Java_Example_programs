package ExamplePrograms;

import java.util.Scanner;

public class UpperOrLowerOrDigitOrSpecial 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Character :");
char ch = sc.next().charAt(0);
if(Character.isUpperCase(ch))
{
	System.out.println("The Given Character is Upper case");
}
else if(Character.isLowerCase(ch))
	{
		System.out.println("The Given Character is Lower case");
	}
else if(Character.isDigit(ch))
	{
		System.out.println("The Given Character is Digit");
	}
else
{
	System.out.println("The Given Character is Special characcter");
}
	}
}

