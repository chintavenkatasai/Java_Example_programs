package Stringsprograms;

public class CapitalizeFirstLetter 
{
public static void main(String[] args) 
{
String word="sravasd vasdsvc vsacasdcf ";
String w="";
String []a = word.split(" ");
String result="";
for(String s:a)
{
   char ch =s.charAt(0);
//   System.out.println(ch);
   ch=Character.toUpperCase(ch);
	w=s.substring(1);
	result+=ch+w+" ";
}
System.out.println(result);
}
}