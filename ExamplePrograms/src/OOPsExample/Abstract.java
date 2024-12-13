package OOPsExample;

 abstract class demo
 {
	 abstract void show();
	 void Message()
	 {
		 System.out.println("fgdjhsaknsc");
	 }
 }
 class demo1 extends demo
 {
	public void show()
	{
		System.out.println("jhsdfkjhgdjhf");
	}
 }
 class demo2 extends demo
 {
	 public void show()
	 {
		 System.out.println("jgfkjutuyyhtygwhhtgkejlwhldk");
	 }
 }
public class Abstract 
{
public static void main(String[] args) 
{
	
demo d=new demo1();
d.show();
d=new demo2();
d.show();
d.Message();

}
}
