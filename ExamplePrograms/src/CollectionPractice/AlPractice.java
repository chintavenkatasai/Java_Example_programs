package CollectionPractice;

import java.util.*;

public class AlPractice {
public static void main(String[] args) {
//	ArrayList<Integer> al=new ArrayList<>();
	ArrayList al=new ArrayList();
	al.add(65);
	al.add(88);
	al.add(76);
	al.add(45);
//	List<String> ll=new ArrayList<>();
	ArrayList ll=new ArrayList();
	ll.add("naidu");
	ll.add("Ranga");
	ll.add("Ramu");
	ll.add(45);
	ll.add(45);
	ll.addAll(al);
	ll.removeAll(al);
	System.out.println(ll);
//	System.out.println(ll.get(2));
//	Iterator itr=ll.iterator();
//	while(itr.hasNext())
//	{
//	 System.out.println(itr.next());
//	}
}
}
