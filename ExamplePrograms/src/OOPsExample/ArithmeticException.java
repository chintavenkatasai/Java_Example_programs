package OOPsExample;

public class ArithmeticException 
{
public static void main(String[] args) 
{
//int a=60;
//int b=0;
//try {
//int c=a/b;
//System.out.println(c);
//}
//catch(Exception e)
//{
//System.out.println(b/a);	
//System.out.println(e);	
//}
	 try {
         Class.forName("com.example.NonExistentClass");
     } catch (ClassNotFoundException e) {
         System.out.println("A ClassNotFoundException occurred: " + e.getMessage());
     }
}
}
