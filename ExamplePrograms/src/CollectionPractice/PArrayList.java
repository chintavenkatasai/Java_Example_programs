package CollectionPractice;
import java.util.*;
public class PArrayList {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	
	al.add(88);
	al.add("Naidu");
	al.add(2.33);
	al.add(0,3);
//	System.out.println(al);
	for(int a=0;a<al.size();a++)
	{
		System.out.println(al.get(a));
	}
}
}
