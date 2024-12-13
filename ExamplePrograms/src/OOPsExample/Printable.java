package OOPsExample;

interface  A6
{
void print();
}
public class Printable  implements A6
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
	Printable a=new Printable();
	a.print();
	}
}
