package OOPsExample;

class Animal1
{
	void Eat()
	{
		System.out.println("Eating...");
	}
}
class Dog1 extends Animal1
{
	void Bark()
	{
		System.out.println("Barking...");
	}
}
class Cat extends Animal1
{
	void Meow()
	{
		System.out.println("Meowing...");
	}
}
public class HierarchicalExample 
{
public static void main(String[] args) 
{
Cat c = new Cat();
c.Meow();
c.Eat();
}
}
