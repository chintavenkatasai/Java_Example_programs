package CollectionPractice;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class exmaple {
//		List<String> list=new Vector<>();
		public static void main(String[] args) {
//			List<String> list=new Vector<>();
			
			Map<Integer,String> m=new Hashtable<>();
			
			m.put(1,"Sai");
			m.put(2,"Vasu");
			m.put(3,"Naveen");
			m.put(4,"Vinay");
		
	
//		for(Map.Entry<Integer,String> e: m.entrySet())
//		{
//			int k=e.getKey();
//			Object b=e.getValue();
//			System.out.println(k+" "+b);
//			
//		}
			Set<Integer> keys=m.keySet();
			
			for(int key:keys)
			{
				System.out.println(key+" >> "+m.get(key));
			}
	}
}
