package CollectionPractice;

import java.util.*;

class Student1 implements Comparable<Student1>
//class Student1 
{
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		return this.id>o.id? 1:this.id<o.id? -1:0;
	}
	
}
public class TreeSetWithComparableInterface {
	public static void main(String[] args) {
	 TreeSet<Student1> t=new TreeSet<Student1>();
      t.add(new Student1(1,"sai"));	 	 
      t.add(new Student1(1,"viny"));	
      t.add(new Student1(5,"vasu"));	
      System.out.println(t.last());
      Iterator it=t.iterator();
    
      while(it.hasNext())
      {
    	  Student1 s=(Student1)it.next();
    	  System.out.println(s.id+" "+s.name);
  
      }
//      for(Student1 s:t)
//      {
//    	  System.out.println(s);
//      }
	}
}