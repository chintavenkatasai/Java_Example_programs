package Basicprograms;

import java.util.Scanner;

public class DigitOccurrences 
{
public static void main(String[] args) 
{
String s = "jhfgahhljas";
char ch;
int count = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to find the number of occurences :");
ch=sc.next().charAt(0);
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==ch)
	{
		count++;
	}
	
}
System.out.println(count);
}
}
