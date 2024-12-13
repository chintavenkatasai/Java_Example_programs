package Collections;

import java.util.*;

public class TestSort {
public static void main(String[] args) {
	ArrayList<String>ls=new ArrayList<String>();
	ls.add("Naresh");
	ls.add("Raghava");
	ls.add("Naidu");
	ls.add("Sarkar");
//	Collections.sort(ls,Collections.reverseOrder());
//	Iterator i=ls.iterator();
//	while(i.hasNext()) {
//	System.out.println(i.next());
//	}
	
	Collections.sort(ls);
    Iterator itr=ls.iterator();
    while(itr.hasNext())
	System.out.println(itr.next());
	
}
}
