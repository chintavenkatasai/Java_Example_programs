package Exception;

class saiException extends Exception
{

	public saiException(String s) {
		super(s);
	}
	
}
public class Custom {
public static void main(String[] args) {
	try
	{
		throw new saiException("jhgjkkj");
	}
	catch(Exception s)
	{
		System.out.println(s);
	}
}
}
