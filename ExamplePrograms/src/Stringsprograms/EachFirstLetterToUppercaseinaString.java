package Stringsprograms;

public class EachFirstLetterToUppercaseinaString {
public static void main(String[] args) {
	String s="hello world";
	String w="";
	String w1="";
	s=s+" ";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch!=' ')
		{
			w=w+ch;
			w1=w.substring(0,1).toUpperCase()+w.substring(1);
		}
		else
		{
			System.out.println(w1);
			w="";
		}
	}
}
}
