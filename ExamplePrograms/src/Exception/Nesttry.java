package Exception;

public class Nesttry {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try
	{
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("jhfgahjdgj ");
		}
		int c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("sai");
	}
	finally
	{
	System.out.println("jtfgjhsajhlfh");
	}
	System.out.println("872364812");
}
}
