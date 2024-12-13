package Basicprograms;

public class SumOfNaturalNumbers 
{
public static void main(String[] args) 
{
	int n=10,sum=0;
	while(n>0)
	{
		sum = sum+n;
		n = n-1;
	}
	System.out.println(sum);
}
}
