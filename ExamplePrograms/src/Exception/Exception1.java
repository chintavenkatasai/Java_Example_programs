package Exception;

import java.io.IOException;


public class Exception1  {
	 void add() throws ClassNotFoundException 
	  {
		  int a=6;
		  int b=88;
		  System.out.println(a+b);
		  try
		  {
		  throw new ClassNotFoundException("jhgajkh");
	  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }
 
  void sub() throws ClassNotFoundException 
  {
	  int a=87;
	  int b=99;
	  add();
//	  System.out.println(a-b);
//	  try {
//			add();
//		}
//		catch(Exception E)
//		{
//			System.out.println(E);
//			System.out.println("sai");
//		}
  }
  
public static void main(String[] args) throws ClassNotFoundException {
	Exception1 e=new Exception1();
	e.sub();
//	try {
//	
//	}
//	catch(Exception E)
//	{
//		System.out.println(E);
//	}
//	System.out.println("hgjfshjahg");
}
}
