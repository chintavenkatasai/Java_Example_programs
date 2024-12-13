package Stringsprograms;

import java.util.Scanner;

public class StringOccurrences 
{
public static void main(String[] args) 
{
String s = "fcvsajhvfhgagvdkh";
char ch;
int count =0;
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
