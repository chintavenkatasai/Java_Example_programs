package CollectionPractice;

import java.util.*;

public class StPractice {
public static void main(String[] args) {
    List<Integer> li=new Stack<>();
//	Set<Integer>li=new HashSet<>();
    li.add(9);
    li.add(8);
    li.add(7);
    li.add(6);
    Collections.sort(li);
    System.out.println(li);
    for(int i=0;i<li.size();i++)
    {
    	System.out.println(li.get(i));
    }
}
}
