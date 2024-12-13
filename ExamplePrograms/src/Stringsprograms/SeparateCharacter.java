package Stringsprograms;

public class SeparateCharacter 
{
public static void main(String[] args) 
{
   String s = "Hello world";
   System.out.println(s);
   char[]characters=s.toCharArray();
   for(char c:characters)
   {
	   System.out.println(c);
   }
}
}
