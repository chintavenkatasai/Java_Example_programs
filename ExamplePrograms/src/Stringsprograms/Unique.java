package Stringsprograms;

public class Unique {
public static void main(String[] args) {
	String s="sainaidu";
	
	int count;
	
	for(int i=0;i<s.length();i++)
	{
		count=0;
		
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}	
		}
		if(count==1)
		{
			System.out.print(s.charAt(i));
		}
	}
	
//	String[] s1=s.split("");
//	
//	int count;
//	for(int i=0;i<s1.length;i++)
//	{
//		count=0;
//		for(String e:s1)
//		{
//			if(e.equals(s1[i]))
//			{
//				count++;
//			}
//		}
//		if(count==1)
//		{
//			System.out.println(s1[i]);
//		}
//		
//	}
	
}
}
