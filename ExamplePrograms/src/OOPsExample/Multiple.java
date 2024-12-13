package OOPsExample;
interface I{
	void show();
}
class II implements I
{	
public void show()
{
	System.out.println("Sai naidu");
}
}
class III implements I
{
	public void show()
	{
		System.out.println("Hello sai naidu");
	}
}
public class Multiple {
public static void main(String[] args) {
	I i=new III();
	i=new II();
	i.show();
	i.show();
}
}
