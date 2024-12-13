package Basicprograms;

public class SumofSeries1 
{
	public static void main(String[] args) 
	{
// 1/1+1/2+1/3+…1/N
		int n=10;
	double sum =0.0;
	for(int i=1;i<=n;i++)
	{
		sum =sum+1.0/i;
	}
	System.out.println(sum);
	
		
		
// 1/1+1/2^2+1/3^2+1/4^2+1/5^2
//	int n=5;
//	double sum =0.0;
//	for(int i=1;i<=n;i++)
//	{
//		sum+=1.0/i*i;
//	}
//	System.out.println(sum);
//	
//	1/1^0+1/2^1+1/3^2+1/4^3+1/5^4	
//	int n=5;
//	double sum =0;
//	for(int i=1;i<=n;i++)
//	{
//		 sum += 1 / Math.pow(i, i - 1);
//	}
//	System.out.println(sum); 
//	
		
//   1/2^0+1/2^1+1/2^2+1/2^3+1/2^4
//	int n=5;
//	double sum =0;
//	for(int i=2;i<=n;i++)
//	{
//		sum+=1/Math.pow(2,i);
//	}
//	System.out.println(sum);
//		
//		
	}
}
