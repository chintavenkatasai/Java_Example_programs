package Basicprograms;

public class EqualDigitsChecker 
{
static String equalornot(int n)
{
    int digit = n%10;
    while(n!=0)
    {
    	int r=n%10;
    	n=n/10;
    	if(r!=digit)
    	{
    		return "It is not equal";
    	}
    }
    return "It is equal";
}
public static void main(String[] args) 
{
int n=6666;
System.out.println(EqualDigitsChecker .equalornot(n));
}
}

