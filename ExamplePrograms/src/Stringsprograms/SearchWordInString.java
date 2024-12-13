package Stringsprograms;

import java.util.Scanner;

public class SearchWordInString 
{
public static void main(String[] args) 
{
String s ="SainaiduChinta";
String w[]=s.split(" ");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Word :");
String s1 = sc.nextLine();

if(s.contains(s1))
{
	System.out.println("Word is found");
}
else
{
	System.out.println("Word is not found");
}
}
}

