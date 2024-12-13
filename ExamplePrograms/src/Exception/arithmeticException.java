package Exception;

public class arithmeticException {
public static void main(String[] args) {
	int a=100;
	int b=0;
	try
	{
		int c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
   finally
   {
	   System.out.println("naidu");
   }
}
}