package Stringsprograms;

public class RemoveSpecialCharactersanddigits 
{
public static void main(String[] args) 
{
String s = "ajjbjbb9749$&%%";
String s1 ="";

for(int i=0;i<s.length();i++)
{
	char ch = s.charAt(i);
	if((!Character.isDigit(ch))&&(Character.isAlphabetic(ch)))
	{
		s1=s1+ch;
	}
	
}
System.out.println(s1);

}
}
