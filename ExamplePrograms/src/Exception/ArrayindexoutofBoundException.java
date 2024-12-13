package Exception;

public class ArrayindexoutofBoundException {
public static void main(String[] args) {
	int a[]= {23,45,6,7};
	try
	{
		System.out.println(a[8]);
//	for(int i=0;i<=a.length;i++)
	{
//		System.out.println(a[8]);
	}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}
}
