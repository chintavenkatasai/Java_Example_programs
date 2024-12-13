package Stringsprograms;

import java.util.Arrays;

public class AlphabeticalOrderandreverseAlphabeticalorder 
{
public static void main(String[] args) 
{
	String s = "hgsdvfkjhhkjfha";
	char a[] = s.toCharArray();
	Arrays.sort(a);
	System.out.println(a);
	
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
}
}
