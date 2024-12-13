package Basicprograms;

public class SmallestandLargestinArray 
{
public static void main(String[] args) 
{
int a[]= {2,33,55,8,77};
int largest=a[0];
int smallest=a[0];

for(int i=0;i<a.length;i++)
{
	if(largest<a[i]) 
	{
	  largest =	a[i];
	}
	if(smallest>a[i])
	{
		smallest=a[i];
	}
}
System.out.println(largest);
System.out.println(smallest);
}
}
