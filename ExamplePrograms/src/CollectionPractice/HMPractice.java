package CollectionPractice;

import java.util.*;
import java.util.Map.Entry;

public class HMPractice {
public static void main(String[] args) {
	Map<Integer,String> hm=new HashMap<>();
	hm.put(100,"Mahesh");
	hm.put(200,"Karthik");
	hm.put(300,"AlluArjun");
    Set<Integer> Keys=hm.keySet();
    for(Integer Key:Keys)
    {
    	System.out.println(Key+">>"+hm.get(Key));
    }
    
    
}
}
