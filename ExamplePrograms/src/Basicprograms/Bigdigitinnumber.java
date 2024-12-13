package Basicprograms;

public class Bigdigitinnumber 
{
public static void main(String[] args) 
{
	int number =346787;
	int bigDigit = 0;
	
	  while (number != 0) {
          int digit = number % 10;  
          if (digit > bigDigit) {
              bigDigit = digit; 
          }
          number /= 10; 
      }	
	  System.out.println(bigDigit);
}
}
