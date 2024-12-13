package ExamplePrograms;

import java.util.Scanner;

public class Numberofdaysinamonth {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the month (1-12):");
	int month = sc.nextInt();
	System.out.println("Enter the year");
	int year = sc.nextInt();
	if ((month <1)||month > 12 ) {
		System.out.println("invalid month.please enter a between 1to 12 ");
		return;
	}
	
	int numberOfDays = getSamplenumbersofdaysinmonth (month, year);
	System.out.println("Number of days in the given month: " + numberOfDays);

	}
private static int getSamplenumbersofdaysinmonth(int month, int year) {
	switch (month){
	 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
         return 31;
     case 4: case 6: case 9: case 11:
         return 30;
     case 2:
    	 if (isLeapYear(year)) {
             return 29;
	}
    	 else {
             return 28;
         }
     default:
         return -1;
         }
}
private static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

}


