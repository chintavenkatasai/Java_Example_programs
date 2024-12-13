package Interface;

 interface Demo
{
	public int add();
}
 class addition implements Demo
 {
	 public int add()
	 {
		 int a=10;
		 int b=23;
		 return a+b;
	 }
 }

public class New {
public static void main(String[] args) {
	Demo d=new addition();
	System.out.println(	d.add());
	Demo d1=new Demo()
			{
		 public int add()
		 {
			 int a=60;
			 int b=23;
			 return a+b;
		 }
			};
	System.out.println(d1.add());
}
}
