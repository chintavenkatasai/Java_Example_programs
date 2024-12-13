package Collections;

import java.util.*;

public class CollectionExampleMaxandMin {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>();
	list.add(9);
	list.add(23);
	list.add(9907);
	list.add(7);
	System.out.println(Collections.min(list));
	System.out.println(Collections.max(list));
	System.out.println();
	List<String> li=new ArrayList<>();
	li.add("Ranga");
	li.add("Ravi");
	li.add("Sai");
	li.add("Ganga");
	li.add("Tata");
	li.add("Anitha");
	li.add("Zeen");
	System.out.println(Collections.min(li));	
	System.out.println(Collections.max(li));
}
}
