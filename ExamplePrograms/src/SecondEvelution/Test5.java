package SecondEvelution;
interface A
{
	void a();
	void b();
	void c();
	void d();
	void e();
}
abstract class  B implements A
{
   public void c()
	{
		System.out.println("I am c");
	}
}
class M extends B
{
	public void a()
	{
		System.out.println("I am a");
	}
	public void b() {
		System.out.println("I am b");
	}
	public void d()
	{
		System.out.println("I am d");
	}
	public void e()
	{
		System.out.println("I am E");
	}
}
public class Test5 {
public static void main(String[] args) {
	A a=new M();
	a.a();
	a.b();
	a.c();
	a.d();
	a.e();
}
}
