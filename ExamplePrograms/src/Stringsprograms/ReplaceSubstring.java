package Stringsprograms;

public class ReplaceSubstring 
{
public static void main(String[] args) 
{
String s ="SaiNaidu";
System.out.println("Before replace word : "+s);
String s1 =s.substring(3);
String s3 ="Chinta";
System.out.println("Added word : "+s3);
s=s.replace(s1,s3);
System.out.println("After replace word  : "+s);

}
}
