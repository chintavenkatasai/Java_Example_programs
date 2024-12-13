package Basicprograms;

public class OddEvenFromArray 
{
public static void main(String[] args) 
{
 int numbers[]= {12,43,54,67,89,23,5};
 System.out.println("Even numbers");
 for(int sum : numbers )
 {
	 if(sum%2==0)
	 {
		 System.out.print(sum+" ");
		 System.out.println();
	 }
 }
 System.out.println("Odd numbers");
 for(int sum:numbers)
 {
	 if(sum%2!=0)
	 {
		 System.out.print(sum+" ");
	 }
 }
 
}
}
