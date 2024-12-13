package Basicprograms;

//public class SumofDigits 
//{
//public static void main(String[] args) 
//{
//int number =4966789;
//   int sum=0;
//   while(number>0)
//   {
//	    int temp=number%10;
//	    
//	    sum=sum+temp;
//	    
//	    number=number/10;
//   }
//   System.out.println(sum);
//}
//}
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
       int number =479663433;
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }
    
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumOfDigits(number / 10);
    }
}


