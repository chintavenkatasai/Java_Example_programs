package Stringsprograms;

public class Strings1 
{
	
public static void main(String[] args) 
{
	double total=0;
for(int i=1;i<=4;i++)
{
	double sum =0;
	double fact=1;
	for(int j=i;j>=1;j--)
	{
		fact=fact*j;
	}
	sum=1/(Math.pow(i,fact));
	total=total+sum;
}
System.out.println(total);
}
}
