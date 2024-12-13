package OOPsExample;

class programmer
{
	float salary=40000;
}
class programmer1 extends programmer
{
	int incriment=7000;
}
public class EmployeeInheritance extends programmer1 {
	
	int bonus=10000;
public static void main(String[] args) 
{
	EmployeeInheritance p = new EmployeeInheritance();
	System.out.println("Programmer salary is :"+p.salary);
	System.out.println("Bonus of Programmer is :"+p.bonus);
	System.out.println("The programmer incriment is :"+p.incriment);
	}
}
