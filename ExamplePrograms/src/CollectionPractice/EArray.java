package CollectionPractice;

import java.util.*;

public class EArray {
public static void main(String[] args) {
	List<Employee> ls=new ArrayList<>(Arrays.asList(
			new Employee(2233,"Ranga","1500000"),
			new Employee(3344,"Naveen","20000")));
	List<Employee> li=new ArrayList<>(Arrays.asList(
			new Employee(4433,"Ramudu","400000")));
	li.addAll(ls);
	Collections.sort(li,(s,s1)->
	{
//		return s.id>s1.id? -1:s.id<s1.id? 1:0;
//		return s.salory.length()>s1.salory.length()? 1:s.salory.length()<s1.salory.length()? -1:0;
		return s.name.length()>s1.name.length()? 1:s.name.length()<s1.name.length()? -1:0;
	});
	Iterator it=li.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
