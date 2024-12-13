package ExamplePrograms;

import java.util.Scanner;

public class PassedOrFailed 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Marks");
int M = sc.nextInt();

	if(M>=35)
	{
		System.out.println("Passed");
		if ((35<M)&&(60>=M))
		{
			System.out.println("Third rank"); 
		}
			 if((60<M)&&(85>=M))
			 {
			System.out.println("Second rank");	
			 }
			 if((85<M)&&(100>=M))
			 {
				 System.out.println("First rank");
			 }
			 }
	else
	{
		System.out.println("faild");
	}
			}
		}
	




