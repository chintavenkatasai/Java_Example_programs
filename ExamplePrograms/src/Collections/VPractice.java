package Collections;
import java.util.*;
public class VPractice {
	public static void main(String[] args) {
		Vector v1 =new Vector();
		v1.add("sai");
		v1.add("naidu");
		v1.add(0,"Ranga");
		
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add("Suresh");
		v2.add("ramesh");
		v2.add("naidu");
		System.out.println(v2);
		v1.addAll(0,v2);
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1.lastIndexOf("naidu"));
		
	}

}
