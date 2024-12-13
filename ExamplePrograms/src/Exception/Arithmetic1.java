package Exception;

public class Arithmetic1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try
		{
			int c=a/b;
			String s="nani";
			int d=Integer.parseInt(s);
			System.out.println(" parent");
			System.out.println(d);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("sai");
		}
		
	}

}
