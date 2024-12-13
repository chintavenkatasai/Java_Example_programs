package Basicprograms;

	
import java.util.Scanner;

public class SumEvenOddDigits {
	public static void main(String[] args) {
		
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        scanner.close();
//
//        int[] sums = sumEvenAndOddDigits(number);
//        System.out.println("Sum of even digits: " + sums[0]);
//        System.out.println("Sum of odd digits: " + sums[1]);
//    }
//
//    public static int[] sumEvenAndOddDigits(int number) {
	  int number=466879768;
        int sumEven = 0;
        int sumOdd = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumEven =sumEven+digit;
            } else {
                sumOdd =sumOdd+digit;
            }
            number /= 10;
        }
            System.out.println(sumEven+": Sum of even numbers");
            System.out.println(sumOdd+": Sum of odd numbers");
    }
}
