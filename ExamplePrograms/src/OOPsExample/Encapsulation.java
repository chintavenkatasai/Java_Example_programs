package OOPsExample;

class Sstudent123 
{
 private int Rollno;
 private String name ;
 private String Mobileno; 

    public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
}
public class Encapsulation {
public static void main(String[] args) 
{
	Sstudent123 s =new Sstudent123();
	
	s.setRollno(403);
	s.setName("Naidu");
	s.setMobileno("8839883743");
	System.out.println(s.getRollno()+" ");
	System.out.println(s.getName()+" ");
	System.out.println(s.getMobileno());
}
}
