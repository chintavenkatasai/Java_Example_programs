package Exception;

import java.nio.channels.AlreadyBoundException;

public class Try {
public static void main(String[] args) {
	
	int a=10;
	int b=0;
	try
	{
		int c=a/b;
	}
	 catch (NullPointerException | AlreadyBoundException |NumberFormatException |ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
}
}
