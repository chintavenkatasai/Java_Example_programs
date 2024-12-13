package Interface;

public interface Laptop {

	public void copy();
	
	public void paste();
	
	public void cut ();
	
	public void keyboard();
	
	default void sai()
	{
		System.out.println("vfhjgfhj");
	}
	
}
 class Apple implements Laptop
{

	public void copy() {
		
		System.out.println("Apple copy code");
	}

	public void paste() {
		
		System.out.println("Apple paste code");
	}
	public void cut() {
		
	System.out.println("Apple cut code ");	
	}	
	public void keyboard() {
		
		System.out.println("Apple keyboard code ");
	}
//   public void sai()
//   {
////	   System.out.println(" Sai code");
//   }
}
  
