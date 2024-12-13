package CollectionPractice;

import java.util.*;
import java.util.Map.Entry;

public class MPractice {
public static void main(String[] args) {
//	List<String> list=new Vector<>();
	
	Map<Integer,String> m=new Hashtable<>();
	
	m.put(1,"Sai");
	m.put(2,"Vasu");
	m.put(3,"Naveen");
	m.put(4,"Vinay");
	System.out.println(m);
//	Set set=m.entrySet();
//	Iterator it=set.iterator();
//	while(it.hasNext())
//	{
//		Map.Entry entry =(Map.Entry)it.next();
//		System.out.println(entry.getKey()+">>"+entry.getValue());
//	}
	Set<Integer> Keys=m.keySet();
	for(Integer Key:Keys)
	{
		System.out.println(Key+" >>> "+m.get(Key));
	}
}
}
