package CollectionPractice;

import java.util.LinkedList;

public class LLPractice {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<>();
	ll.add("yy");
	ll.add("y1");
	ll.add("y2");
	ll.add("y3");
	ll.add("y4");
	ll.add(1,"tt");
	LinkedList<String> l1=new LinkedList<>();
	l1.add("Sai");
	l1.add("VAsu");
	l1.add("Naidu");
	l1.add("Vinay");
	ll.addAll(l1);
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
}
}
