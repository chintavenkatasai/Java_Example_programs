package SamplePrograms;

public class Harmonicsum1 
{
	    public static void main(String[] args) 
	    {    	
// 1/1+1/2+1/3+…1/N  	
	        int n=10; 
	        double sum=0.0;
	        for (int i=1;i<=n;i++) 
	        {
	            sum +=1.0/i;
	        }
	        System.out.println(sum);
	    }
	}

