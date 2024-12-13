package SamplePrograms;

public class PallindromeorNot {
public static void main(String[] args) {
	int n=121,temp,sum=0,r;
	temp=n;
	while(n!=0)
	{
		r=n%10;
		sum=r+sum*10;
		n=n/10;
	}
	System.out.println(sum);
//	if(temp==sum)
//	{
//		System.out.println("Given number is pallindrome");
//	}
//	else
//	{
//		System.out.println("Given number is not pallindrome");
//	}
}
}
