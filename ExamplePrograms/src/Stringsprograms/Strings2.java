package Stringsprograms;

import java.util.Scanner;

public class Strings2 
{
public static void main(String[] args) 
{
	int sum=0;
 int a[] = {2,44,6,6,28};
 for(int i:a)
//Scanner sc =new Scanner(System.in);
//System.out.println("Enter the number :");
//int i=sc.nextInt();
 {
	 sum=0;
	 for(int j=1;j<i;j++)
	 {
		 if(i%j==0)
		 {
			 sum=sum+j;
		 }
	 }
	 if(i==sum)
	 {
		 System.out.println(i+" is perfect number");
	 }
	 else
	 {
		 System.out.println(i+" Given number is not perfect");
	 }
 }
}
}
