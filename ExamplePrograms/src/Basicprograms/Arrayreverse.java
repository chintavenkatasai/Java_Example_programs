package Basicprograms;

public class Arrayreverse 
{
public static void main(String[] args) 
{
int a[]= {23,4,556,643,56};
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Reverse order in array");

for(int i=a.length-1;i>=0;i--)
{
	System.out.print(a[i]+" ");
}
}
}
