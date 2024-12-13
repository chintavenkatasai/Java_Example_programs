package SamplePrograms;

import java.util.Scanner;

public class Perfectnumbers 
{
public static void main(String[] args) 
{
int num=55,sum=0;
//Scanner sc =new Scanner(System.in);
//System.out.println("Enter the number :");
//  num = sc.nextInt();
   for(int i=1;i<num;i++)
   {
	  if (num%i==0) 
	  {
		sum=sum+i;  
	  }
   }
	  if(sum==num)
	  {
		  System.out.println("Given number is  perfect :"+sum);
	  }
	  else
	  {
		  System.out.println("Given number is not perfect");
	  }
   }
}

