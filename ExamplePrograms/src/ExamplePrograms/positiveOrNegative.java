package ExamplePrograms;

import java.util.Scanner;

public class positiveOrNegative 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);	
System.out.println("Enter The number :");
int  num = sc.nextInt();
if(0<num)
{
	System.out.println("The Given Number is Positive :" +num);
}
else
{
	System.out.println("The Given Number is Negative :"+num);
}
}
}
