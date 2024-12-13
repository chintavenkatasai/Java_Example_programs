package Basicprograms;

public class Usingternary 
{
public static void main(String[] args) 
{
	int a=10;
	int b=20;
	int c=60;
	
	int Smallest =(a<b)?(a<c?a:c):(b<c?b:c);
	
	System.out.println("The Smallest number is "+Smallest);
}
}
