package Stringsprograms;

public class CommonCharactersFromDifferentStrings {
public static void main(String[] args) {
	String s="hello";
	String s1="hlih";
	String s2="";
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<s1.length();j++)
		{
			if(s.charAt(i)==s1.charAt(j))
			{
				s2=s2+s.charAt(i);
			}
		}
	}
	System.out.println(s2);
}
}
