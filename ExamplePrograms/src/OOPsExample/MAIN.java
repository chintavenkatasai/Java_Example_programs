package OOPsExample;

public class MAIN {
static int myMethod(int a,int b)
{
	return a+b;
}
static double myMethod(double a,double b)
{
	return a+b;
}
public static void main(String[] args) {
	int c=myMethod(23,44);
	double d=myMethod(22.3,33.5);
	System.out.println(c);
	System.out.println(d);
}
}
