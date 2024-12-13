package Basicprograms;

public class Duplicatesanarray 
{
public static void main(String[] args) 
{
int a[]= {2,3,6,7,5,5,5,7};
int count=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			System.out.println(a[i]+" ");
			count++;
		}
	}
}
System.out.println();
System.out.println("Duplicate elements in an array is :" +count);
}
}
