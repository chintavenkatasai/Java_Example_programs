package OOPsExample;

class Adder
{
static int add(int a,int b)
{
	return a+b;
}
static int add(int a,int b,int c)
{
    return a+b+c;	
}
}
public class TestOverloading 
{
public static void main(String[] args) 
{
System.out.println(Adder.add(111,111));
System.out.println(Adder.add(12,14,16));
}
}

