package Stringsprograms;

public class Palindrome 
{
public static void main(String[] args) 
{
String w[]= {"sai","vasu","aba","dad"};
int count=0;
for(String s:w)
{
	if(ispallindrome(s))
	{
		count++;
	}
}
System.out.println("NUmber of palindrome words is: "+count);
}
 public static boolean ispallindrome(String n)
 {
int i=0,j=n.length()-1;
while(i<j)
{
	if(n.charAt(i)!=n.charAt(j))
	{
		return false;
	}
	i++;
	j--;
}
 return true;
}
}



