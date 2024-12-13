package Basicprograms;
	import java.util.Scanner;

	public class SumFirstLastDigit {
	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter a number: ");
//	        int number = scanner.nextInt();
//
//	        int sum = sumFirstAndLastDigit(number);
//	        System.out.println("The sum of the first and last digits is: " + sum);
//	    }
//
//	     static int sumFirstAndLastDigit(int number) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the number :");
	    	int number = sc.nextInt();
	        int lastDigit = number % 10;
	        int firstDigit = number; 

	       
	        while (firstDigit >= 10) {
	            firstDigit=firstDigit/10;
	        }

	        System.out.println( firstDigit + lastDigit );
	    }
	}


