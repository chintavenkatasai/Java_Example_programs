package CollectionPractice;

import java.util.*;

public class IlPractice {
public static void main(String[] args) {
	List<Student> il=new ArrayList<>(Arrays.asList(
	new Student(403,"Sai",23,"6573586"),
	new Student(404,"Vasu",22,"8897329610")));
	HashSet<Student> ll=new HashSet<>(Arrays.asList(
			new Student(403,"Sai",23,"6573586"),
			new Student(404,"Vasu",22,"8897329610"),
			new Student(405,"naveen",24,"8897"),
			new Student(403,"Sai",23,"6573586")));
	ll.removeAll(il);
	System.out.println(ll);
//	System.out.println(ll);
//	System.out.println(il.get(1));
	Iterator<Student> it=ll.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	Iterator<Student> it1=il.iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	
//    
}
}
