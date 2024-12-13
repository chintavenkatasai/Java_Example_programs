package Com.raam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class Students
{
	int id;
	String name;
	int age;
	Students(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Vasu {
public static void main(String[] args) {
	
	ArrayList<Students> al=new ArrayList<>();
	al.add(new Students(9,"sai",23));
	al.add(new Students(1,"vasu",22));
	al.add(new Students(3,"naveen",24));
//	Collections.sort(al,(s,s1)->
//	{		
//	return s.name.length()>s1.name.length()?-1:s.name.length()<s1.name.length()? 1:0;
//	});
    Collections.sort(al, (s1, s2) -> s1.name.compareTo(s2.name));
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		Students d=(Students)itr.next();
		
		System.out.println(d.id+" "+d.name+" "+d.age);
	}
}
}
