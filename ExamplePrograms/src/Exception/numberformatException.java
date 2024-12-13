package Exception;

public class numberformatException {
public static void main(String[] args) {
	int a;
	try {
	a=Integer.parseInt("hjfgb");
}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("sai");
	}
}
}
