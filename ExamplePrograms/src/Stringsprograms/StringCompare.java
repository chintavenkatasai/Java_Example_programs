package Stringsprograms;

public class StringCompare 
{
public static void main(String[] args) 
{
   String s1 ="Hello";
   String s2 ="Hello";
   String s3 = new String("Hello");
   String s4 = "World";
   
   System.out.println(s1.equals(s2));
   System.out.println(s2.compareTo(s3));
   System.out.println(s3==(s4));
}
}
