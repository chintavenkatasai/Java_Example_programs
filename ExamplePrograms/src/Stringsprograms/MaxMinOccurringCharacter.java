package Stringsprograms;

public class MaxMinOccurringCharacter 
{
public static void main(String[] args) 
{
String s="aaaaahhhiieh";
String s1[]=s.split("");
String maxchar="",minchar="";
int max=1,min=Integer.MAX_VALUE;
for(String w : s1)
{
int	count=0;
	for(int i=0;i<s.length();i++)
	{
		if(w.charAt(0)==s.charAt(i))
		{
			count++;
		}
	}

	if(max<count)
	{
		max=count;
		maxchar=w;
	}
	else if(min>count)
	{
		min=count;
		minchar=w;
	}
	
}
System.out.println("Maximum "+max+" "+maxchar);
System.out.println("Minimum "+min+" "+minchar);


}
}
