package OOPsExample;

class Animal
{
	void eat()
	{
	System.out.println("Eating...");	
	}
}
class Dog extends Animal
{
	void Bark()
	{
		System.out.println("Barking...");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}
public class Testinheritance 
{
public static void main(String[] args) 
{
BabyDog d=new BabyDog();
 d.eat(); 
 d.Bark();
 d.weep();
 
}
}
