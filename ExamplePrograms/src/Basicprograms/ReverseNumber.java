package Basicprograms;

public class ReverseNumber 
{
public static void main(String[] args) 
{
	int number=68768;
	int reversed = 0;
    while (number != 0) {
        int digit = number % 10; 
        reversed = reversed * 10 + digit; 
        number = number/10; 
    }
    System.out.println(reversed);
}
}
