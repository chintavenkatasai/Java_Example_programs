package ExamplePrograms;

import java.util.Scanner;

public class CompareusingTernary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int num2 = sc.nextInt();
		
		int biggest =(num1>num2) ? num1 : num2;
		
		if(num1==num2)
		{
			System.out.println("The two numbers are equal");
			
		}
		else
		{
			System.out.println("The biggest number is :"+biggest);
		}
	}

}
