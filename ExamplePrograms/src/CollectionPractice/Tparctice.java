package CollectionPractice;

import java.util.*;

public class Tparctice {
public static void main(String[] args) {
	Set<String> ss=new TreeSet<>();
	ss.add("Tata");
	ss.add("Satish");
	ss.add("yadagiri");
	Iterator it=ss.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
