package Exception;
class Addition{
	void add()
	{
	int a=100;
	int b=7;
//	int c=a/b;
	if(a>b) {
		
	throw new NullPointerException("hgfdshjgkijh");
}else
{
	System.out.println("jhtgyyjahadkuyteuwy");
}
	}
}
class Operation extends Addition
{
	void show()
	{
		add();
	}
	void dis()
	{
		try
		{
		show();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Throw {
public static void main(String[] args) {
	Operation op= new Operation();
     op.dis();
}
}
