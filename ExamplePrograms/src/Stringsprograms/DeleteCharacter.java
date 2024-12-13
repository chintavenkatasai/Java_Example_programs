package Stringsprograms;

import java.util.Scanner;

public class DeleteCharacter 
{
public static void main(String[] args) 
{
String s = "vhhjdjhjj";	
String d ="";
Scanner sc = new Scanner(System.in);
System.out.println("Enter the delete Character :");
char ch =sc.next().charAt(0);
 for(int i=0;i<s.length();i++)
 {
	 if(s.charAt(i)!=ch)
	 {
		 d=d+s.charAt(i);
	 }
 }
 System.out.println(d);
}
}