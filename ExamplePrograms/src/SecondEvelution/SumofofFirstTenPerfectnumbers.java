package SecondEvelution;
	public class SumofofFirstTenPerfectnumbers {
     public static void main(String[] args) {
		int sum1=0,k=0;
		for(int i=0;i<=10000;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i+"is perfect number");
				k++;
			}
			if((k<=10)&&(sum==i))
			{
				sum1=sum1+i;
			}
		}
		System.out.println(sum1+"sum of First 10 perfect numbers ");
	
     }
	}
