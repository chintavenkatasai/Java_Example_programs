package CollectionPractice;

import java.util.*;

public class Vpractice {
public static void main(String[] args) {
	List<Integer> v=new Vector<>();
	
	v.add(76);
	v.add(6);
	v.add(88);
	v.add(65);
	v.add(90);
	v.add(0,44);
	Iterator it=v.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
