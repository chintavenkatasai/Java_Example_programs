package ExamplePrograms;
import java.util.Scanner;

public class Inputchecker {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character :");
    String input = sc.nextLine();
    if(input.length()!=1)
    {
    	System.out.println("Enter only one character");
    }
    else {
    	char ch = input.charAt(0);
    
    if(Character.isDigit(ch))
    
    {
    	System.out.println("you a entered digit "+ch);
    }
    else if (Character.isLetter(ch))
    {
    	System.out.println(" you a entered letter" +ch);
    }
    else
    {
    	System.out.println("you a entered specialcharacter :"+ch);
    }
 
    }
    }
}


