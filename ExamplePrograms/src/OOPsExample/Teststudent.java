package OOPsExample;


 class Student 
{
int id=403;
String name="Niadu";
}

public class Teststudent 
{
	public static void main(String[] args) {
		
		Student s=new Student();
		Student s1=new Student();
		s.id=403;
		s.name="Sai";
	    s1.id=404;
	    s1.name="Nani";
		System.out.println(s.id+" "+s.name);
		System.out.println(s1.id+" "+s1.name);
	}
}
