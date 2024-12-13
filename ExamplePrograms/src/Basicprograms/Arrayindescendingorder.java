package Basicprograms;

import java.util.Arrays;
import java.util.Collections;

public class Arrayindescendingorder 
{
public static void main(String[] args) 
{
int a[]= {4,7,8,6,5,9};
for(int i=0;i<a.length;i++)
{
	  
	Arrays.sort(a);
	
	System.out.print(a[i]+" " );
}
System.out.println();
for(int i=a.length-1;i>=0;i--)
{
	System.out.print(a[i]+" ");
}
}
}