package Stringsprograms;

import java.util.Scanner;

public class StringAnalysis 
{
public static void main(String[] args) 
{
int Word=0,vowel=0,consonants=0,digit=0,specialcharacters=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String :");
String s = sc.nextLine();
String Word1 =" ";
s=s+" ";
for(int i=0;i<s.length();i++)
{
	char ch = s.charAt(i);
	if(Character.isAlphabetic(ch))
	{
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'|| ch=='a' ||ch=='e' || ch=='i'|| ch=='o' || ch=='u')
		{
			vowel++;
		}
		else
		{
			consonants++;
		}
		}
	
	if(Character.isDigit(ch))
	{
	digit++;
	}
	else if((!Character.isAlphabetic(ch)&&(!Character.isDigit(ch))))
	{
		specialcharacters++;
	}
}
for(int i=0;i<s.length();i++)
{
	char ch1=s.charAt(i);
	if(ch1!=' ') 
	{
	Word1=Word1+ch1;
	}
	else
	{
		
		Word++;
		Word1=" ";
	}
}

System.out.println("Number of vowels in the given String is :"+vowel);
System.out.println("Number of consonants in  the given String is :"+consonants);
System.out.println("Number of Digits in the given String is :"+digit);
System.out.println("Number of specialcharacters in the given String is :"+specialcharacters);
System.out.println("Number of words in the given String is :"+ Word);
}
}

