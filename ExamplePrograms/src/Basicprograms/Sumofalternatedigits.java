package Basicprograms;

import java.util.Scanner;

public class Sumofalternatedigits 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Digit :");
	int num = sc.nextInt();
	int sum=0;
	boolean add =true;
	 while (num != 0) {
         int digit = num % 10;
         if (add) 
         { 	  
             sum =sum+digit;
         }
         add = !add;
         num=num/10;
     }
     
     System.out.println("The sum of alternate digits is: " + sum);
 }
}

