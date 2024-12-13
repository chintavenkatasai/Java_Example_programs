package Collections;

import java.util.Arrays;
import java.util.*;

public class Example1 {
public static void main(String[] args) {
	Object[] arr=new Object[] {2,3,6,77,8,9};
	Vector<Integer> v1=new Vector<Integer>();
	v1.add(87);
	v1.add(null);
	v1.add(null);
	v1.add(87);
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
}
}
