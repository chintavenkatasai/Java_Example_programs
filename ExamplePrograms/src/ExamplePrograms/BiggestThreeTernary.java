package ExamplePrograms;

import java.util.Scanner;

public class BiggestThreeTernary 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number :");
int num1 = sc.nextInt();
System.out.println("Enter the second number :");
int num2 = sc.nextInt();
System.out.println("Enter the third number :");
int num3 = sc.nextInt();

int biggest = (num1 > num2) ? 
        ((num1 > num3) ? num1 : num3) : 
        ((num2 > num3) ? num2 : num3);
System.out.println("The biggest number is :"+biggest);
}
}
