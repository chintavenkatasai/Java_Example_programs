package Basicprograms;

public class SwastikPattern {
public static void main(String[] args) {
	int num=7;
	int mid=(num/2)+1;
	for(int i=1;i<=num;i++)
	{
   	for(int j=1;j<=num;j++)
		{
			if((i==mid)||(j==mid)||(i==1 && j>mid)||(i==num && j<mid)
					||(j==1 && i<mid)||(j==num && i>mid))
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
