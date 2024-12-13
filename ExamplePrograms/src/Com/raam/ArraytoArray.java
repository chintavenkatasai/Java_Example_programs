package Com.raam;

import java.util.Arrays;

public class ArraytoArray {
public static void main(String[] args) {
      int a[]= {12,34,55,643,7,8,9};
      int b[]=new int[a.length];
      
      for(int i=0;i<a.length;i++)
      {
    	  b[i]=a[i];
      }
      System.out.println("Array b " +Arrays.toString(b));
	}
}

