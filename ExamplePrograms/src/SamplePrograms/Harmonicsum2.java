package SamplePrograms;

public class Harmonicsum2 
{
public static void main(String[] args) 
{
  int n=10;
  double sum =0.0;
  for(int i=1;i<=n;i++)
  {
	  sum +=1.0/i*i;
  }
  System.out.println( sum);
}
}
