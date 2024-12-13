package CollectionPractice;

import java.util.*;

public class Spractice {
public static void main(String[] args) {
	Set<String> s=new HashSet<>();
	
	s.add("SS");
	s.add("S1");
	s.add("S2");
	s.add("S3");
	s.add("SS");
	s.add("S3");
	System.out.println(s);
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
