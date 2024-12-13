package Arrays;

public class BigofElements {
	public static void main(String[] args) {
		int a[]= {423,456,897,826,657,33,654};
		
	for(int i=0;i<=a.length-1;i++)
	{
		int big=0,r;
		while(a[i]!=0)
		{
			r=a[i]%10;
			if(big<=r)
//		if(Small>r)
		{
				big=r;
//			Small=r;
		}
		a[i]=a[i]/10;
		}
		System.out.println(big);
//		System.out.println(Small);
	}
	}

}
