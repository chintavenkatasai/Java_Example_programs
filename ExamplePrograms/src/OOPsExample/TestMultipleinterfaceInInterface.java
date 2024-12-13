package OOPsExample;
interface Printables
{
	abstract void print();
}
interface Showable
{
	abstract void print();
}
public class TestMultipleinterfaceInInterface implements Printables,Showable {
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		TestMultipleinterfaceInInterface obj=new TestMultipleinterfaceInInterface();
		
		obj.print();
	}

}
