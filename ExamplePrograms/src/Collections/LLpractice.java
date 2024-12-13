package Collections;
import java.util.*;
public class LLpractice {
	
	
private static Object foreach;
private static Object foreach2;

public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("S1");
	al.add("S2");
	al.add("S3");
	ArrayList<String> ll=new ArrayList<>();
//	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Y1");
	ll.add("Y2");
	ll.add("S3");
	ll.add("S3");
	ll.add(1,"YY");
	ll.addAll(al);
	System.out.println(ll);
	
//	ll.clear();
//	System.out.println(ll);
}
}
