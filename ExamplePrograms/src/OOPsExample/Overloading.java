package OOPsExample;

public class Overloading 
{
   public void sum(int a,int b)
   {
	   System.out.println(a+b);
   }
   public void sum(int a,int b,int c)
   {
	   System.out.println(a+b+c);
   }
   public void sum(double a,int b)
   {
	   System.out.println(a*b);
   }
   public static void main(String[] args) 
   {
	Overloading ol = new Overloading();
	ol.sum(60,70);
	ol.sum(10,20,30);
	ol.sum(10.8,2);
}
}
