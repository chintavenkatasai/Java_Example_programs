package Basicprograms;

import java.util.Scanner;

public class InputChecker 
{
public static void main(String[] args) 
{Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");
char ch = sc.next().charAt(0);
if(Character.isUpperCase(ch)) {
	System.out.println(+ch+ " given value is in upper case");
}
else if(Character.isLowerCase(ch))
{
	System.out.println("given value is in lower case");
}
else if(Character.isDigit(ch))
{
	System.out.println("given value is in digits");
}
else {
	System.out.println("given value is special character");
}
}
}

