package CollectionPractice;

import java.util.*;

class Faculty {
    int id;
    String name;
    String experience;
	public Faculty(int id, String name, String experience) {
//		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}
//	@Override
//	public String toString() {
//		return "Faculty [id=" + id + ", name=" + name + ", experience=" + experience + "]";
//	}    
}
public class Fpractice
{
	public static void main(String[] args) {
		List<Faculty> lf=new ArrayList<>(Arrays.asList(
			new	Faculty(101780,"Raju","OneYear"),
			new Faculty(10276,"Naidu","TwoYears"),
			new Faculty(1042709,"Sandeep","FourYears"),
			new Faculty(10364877,"Saradhi","FiveYears")));
		Collections.sort(lf,(s,s1)->
		{
			return s.id>s1.id? 1:s.id<s1.id? -1:0;
		});
		
	    Iterator it=lf.iterator();
	    while(it.hasNext())
	    {
	    	Faculty s=(Faculty)it.next();
	    	System.out.println(s.id+" "+s.name+" "+s.experience);
	    }
	}
}

