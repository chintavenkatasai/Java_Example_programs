package Stringsprograms;

public class StringsCharAt 
{
public static void main(String[] args) 
{
String s ="i am sai naidu";
int count =0;
 for(int i=0;i<=s.length()-1;i++)
 {
	 if(s.charAt(i)=='i')
	 {
		 count++;
	 }
 }
 System.out.println(count);
}
}
