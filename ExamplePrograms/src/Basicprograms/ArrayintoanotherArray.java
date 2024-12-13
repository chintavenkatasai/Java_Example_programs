package Basicprograms;

public class ArrayintoanotherArray 
{
public static void main(String[] args) 
{
int a[]= {2,4,66,56,43,23};
//int b[]=new int[a.length];
int b[]= {};
b=a;
//for(int i=0;i<a.length;i++)
//{
//	System.out.print(a[i]+" ");
//}
//System.out.println(" ");
for(int i=0;i<b.length;i++)
{
	System.out.print(b[i]+" ");
}
}
}
