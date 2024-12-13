package Exception;

public class stringIndexOutOfBoundException {
public static void main(String[] args) {
	
	String s1="hjgjgdj";
	try {
		throw new Exception("yghjkjljk");
//	System.out.println(s1.charAt(9));
	}
	catch(Exception e)
	{
		System.out.println(e);	
//		throw e; 
	}
	finally
	{
		int a=13;
		int b=6;
		System.out.println(a+b);
	}
}
}
