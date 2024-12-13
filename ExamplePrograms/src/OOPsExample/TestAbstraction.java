package OOPsExample;

      abstract class Shapes {
	abstract void draw();
}
class Rectangles extends Shapes
{
	void draw()
	{
		System.out.println("drawing Rectangle");
	}
}
class Circle extends Shapes
{
	void  draw()
	{
		System.out.println("drawing Circle");
	}
}
public class TestAbstraction
{
	public static void main(String[] args) {
		Shapes s=new Rectangles();
		s.draw();
	}
		
	}

