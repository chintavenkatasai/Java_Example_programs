package Arrays;

public class Primenumbers {
public static void main(String[] args) {
	int a[]= {2,7,5,99,67,22,66,88};
	for(int n:a)
	{
		if(isPrime(n))
		{
			System.out.println(n+" is prime number.");
		}
	}
}
  public static boolean isPrime(int n)
  {
	  if(n<=1)
	  {
		  return false;
	  }
	  for(int i=2;i<=Math.sqrt(n);i++)
	  {
		  if(n%i==0)
		  {
			  return false;
		  }
	  }
	  return true;
  }
}
