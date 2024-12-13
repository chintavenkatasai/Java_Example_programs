package ExamplePrograms;

import java.util.Scanner;

public class OccurrenceCounterWithoutArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number to count occurrences: ");
        int target = scanner.nextInt();
        
        int count = 0;  
        int number;     
        
        System.out.println("Enter numbers (enter -1 to stop):");
        
        while (true) {
            number = scanner.nextInt();
            
            if (number == -1) {  
                break;
            }
            
            if (number == target) {
                count++;
            }
        }
        
        System.out.println("The number " + target + " occurs " + count + " times.");
        scanner.close();
    }
}
