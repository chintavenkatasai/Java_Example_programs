package Stringsprograms;


public class ReverseAndLength 
{
private static final String S = null;

public static void main(String[] args) 
{
	 String s ="sainaidu";
	 int length =0;
	 System.out.println("The given String length");
	for(int j=0;j<s.length();j++)
	{
		length++;
	}
	System.out.println(length);
	System.out.println("The given String is reversed");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
}
}