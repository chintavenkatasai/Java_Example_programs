package SamplePrograms;

public class Patterntype3 
{
public static void main(String[] args) 
{
for(int i=1;i<=5;i++)
{
	for(int j=5;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int s=1;s<=(2*i-1);s++)
	{
		System.out.print(s);
	}
	System.out.println();
}
}
}
