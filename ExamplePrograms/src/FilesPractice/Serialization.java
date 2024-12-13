package FilesPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Demo implements Serializable
{
	int id;
	String name;
	int age;
	
	Demo(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}

}
public class Serialization {
public static void main(String[] args)throws Exception {
	
	ArrayList<Demo> de =new ArrayList<>();
	de.add(new Demo(12,"sai",23));
	de.add(new Demo(13,"naidu",24));
	de.add(new Demo(14,"naveen",25));
	
	FileOutputStream fo=new FileOutputStream("./serializ.txt");
	ObjectOutputStream oo=new ObjectOutputStream(fo);
	oo.writeObject(de);
	
	fo.close();
	
	FileInputStream fi=new FileInputStream("./serialize.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	List<Demo> d=(List<Demo>)oi.readObject();
    Iterator itr = d.iterator();
    
    while(itr.hasNext())
    {
    	Demo dd=(Demo)itr.next();
    	System.out.println(dd.id+" "+dd.name+" "+dd.age);
    }
	
    fi.close();
    oi.close();
}
}
