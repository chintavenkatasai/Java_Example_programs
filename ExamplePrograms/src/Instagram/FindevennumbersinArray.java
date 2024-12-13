package Instagram;

public class FindevennumbersinArray {
	public static void main(String[] args) {
		int a[]= {2,5,6,8,90,4,33,77,99,28};
//		System.out.println("The even numbers are give arrays:");
//		for(int a1:a)
//		{
//			if(a1%2==0)
//			{
//				System.out.println(a1);
//			}
//		}
		
//	  int count=0;
	  for(int a1:a)
	  {
		  int sum=0;
		  for(int i=1;i<a1;i++)
		  {
			  if(a1%i==0)
			  {
				  sum=sum+i;
			  }
		  }
		  if(sum==a1)
		  {
			  System.out.println(a1);
		  }
	  }
	}

}
