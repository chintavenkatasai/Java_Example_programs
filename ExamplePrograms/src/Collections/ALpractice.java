package Collections;

import java.util.*;

public class ALpractice {
	public static void main(String[] args) {
		Integer arr[]=new Integer[] {2,4,6,7,4,8};
		ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
		al1.add(67);
		System.out.println(al1);
		System.out.println(al1.size());
		System.out.println(al1.get(3));
		al1.set(0, 33);
		System.out.println(al1);
		System.out.println(al1.remove(al1));
		System.out.println(al1);
//		for(int i=0;i<al1.size();i++)
//		{
//			System.out.print(al1.get(i)+ " ");
//		}
//		Collections.synchronizedList(al1);
	}

}
