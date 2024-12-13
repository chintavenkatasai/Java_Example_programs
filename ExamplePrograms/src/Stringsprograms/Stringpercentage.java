package Stringsprograms;

public class Stringpercentage 
{
public static void main(String[] args) 
{
int vowels=0,consonants=0,uppercase=0,lowercase=0,specialchar=0;
 String s ="vbfmDGFD353634*//*";
 int length =s.length();
 for(int i=0;i<=s.length()-1;i++)
 {
	 char ch=s.charAt(i);
	 if(Character.isAlphabetic(ch))
	 {
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		 {
			 vowels++;
		 }
		 else
		 {
			consonants++;
		 }
	 }
	 if(Character.isUpperCase(ch))
	 {
		 uppercase++;
	 }
	 else
	 {
		 lowercase++;
	 }
	 if(!Character.isAlphabetic(ch)&&(!Character.isDigit(ch)))
	 {
		 specialchar++;
	 }
 }
 int vowelPercentage = (vowels * 100) / length;
 int consonantPercentage = (consonants * 100) / length;
 int uppercasePercentage = (uppercase * 100) / length;
 int lowercasePercentage = (lowercase * 100) / length;
 int specialcharPercentage = (specialchar * 100) / length;
 
 
System.out.println("The vowels percentage in String       :"+vowelPercentage+"%");
System.out.println("The consonants percentage in String   :"+consonantPercentage+"%");
System.out.println("The specialchar percentage in String  :"+specialcharPercentage+"%");
System.out.println("The uppercase percentage in  String   :"+uppercasePercentage+"%");
System.out.println("The lowercase percentage in String    :"+lowercasePercentage+"%");

}
}
