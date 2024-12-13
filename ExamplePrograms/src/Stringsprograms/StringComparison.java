package Stringsprograms;

public class StringComparison 
{
public static void main(String[] args) 
{
String s1="naidu";
String s2="naido";
int count =0;
if(s1.length()!=s2.length())
{
	System.out.println("Not same");
	
}
else {
for(int i=0;i<s1.length();i++) 
{
if(s1.charAt(i)==s2.charAt(i))
{
  count++;
}
else
{
	System.out.println("String are different");
	break;
}
}
if(count==s1.length()) {
	System.out.println("Strings are same");
}}
}
}
