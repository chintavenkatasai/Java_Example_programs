package Stringsprograms;

public class NamesStartingWith 
{
public static void main(String[] args) 
{
String s[]= {"naidu","shiva","sainaidu"};
String p[]= {"s"};
for(String s1:p)
{
	System.out.println("I want this character Word :"+s1);
	
	for(String name:s)
	{
		if(name.startsWith(s1))
		{
			System.out.println(name);
		}
	}
}
}
}
