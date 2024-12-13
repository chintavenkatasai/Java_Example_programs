package Basicprograms;

public class Main1 {
static void CheckAge(int age)
{
   if(age < 18)
   {
	   System.out.println("You are not eligible");
   }
   else
   {
	   System.out.println("Your are eligible");
   }
}
public static void main(String[] args) {
	CheckAge(17);
	CheckAge(23);
}
}
