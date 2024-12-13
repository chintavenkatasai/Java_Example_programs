package Arrays;

import java.util.Scanner;


public class ArraytoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the array size:");
        int size = sc.nextInt();  
        int arr[] = new int[size];    
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int element : arr) {
        	
        	if(element%2==0)
        	{
        		System.out.print(element + " ");
        	
        }
    }
    }
}

