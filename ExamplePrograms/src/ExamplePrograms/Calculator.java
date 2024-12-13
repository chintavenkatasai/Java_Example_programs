package ExamplePrograms;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) 
{
	System.out.println("Enter first number :");
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	System.out.println("Enter second number :");
	Scanner s =new Scanner(System.in);
	int n2 = s.nextInt();
	  System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Exit");
      Scanner ch = new Scanner(System.in);
      int option = ch.nextInt();
       
      
      switch (option){
      case 1:
    	  option =n1+n2;
          break;
      case 2:
    	  option = n1-n2;
         
          break;
      case 3:
    	  option = n1*n2;
          
          break;
      case 4:
    	  option = n1%n2;
    	  break;
      }
      System.out.println(option);

}
}
