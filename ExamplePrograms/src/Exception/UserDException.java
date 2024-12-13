package Exception;

import java.util.Scanner;

class sai extends Exception{
	public sai (String s)
	{
		super(s);
	}
}
public class UserDException {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your age");
	int age = sc.nextInt();
	
try {
	if(age<18)
	{
		throw new sai("you are not eligible");
	}
	else {
		System.out.println("you are eligible");
	}
}
catch(sai s)
{
	System.out.println(s.getMessage());
}
}
}
