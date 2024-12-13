package Stringsprograms;

public class VowelsandConsonants 
{
public static void main(String[] args) 
{
int vowels=0,consonants=0;

String s = "jahgdfahlkjhkas";
for(int i=0;i<s.length();i++)
{
	char ch = s.charAt(i);
	
	if(Character.isAlphabetic(ch))
			{
       if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       {
    	   vowels++;
       }
       else
       {
    	   consonants++;
       }
	}
}
     System.out.println(vowels);
     System.out.println(consonants);
}
}
