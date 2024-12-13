package CollectionPractice;

import java.util.*;

public class LHSPractice {
public static void main(String[] args) {
	LinkedHashSet<String> ls=new LinkedHashSet<>();
	ls.add("Sravan");
	ls.add("Raam");
	ls.add("Ranga");
	ls.add("Naveen");
	ls.add("Arjun");
	LinkedHashSet<String> lh=new LinkedHashSet<>();
	lh.add("Ramu");
	lh.add("Srinu");
	lh.add("Raju");
	lh.addAll(ls);
	System.out.println(lh);
	Iterator it=lh.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
