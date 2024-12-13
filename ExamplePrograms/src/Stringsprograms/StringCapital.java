package Stringsprograms;

public class StringCapital {
	public static void main(String[] args) {
		String s= "SaiNaidU";
	   String result="";
	   for(int i=0;i<s.length();i++)
	   {
		   char ch=s.charAt(i);
		   if(Character.isUpperCase(ch))
		   {
			   result+=Character.toLowerCase(ch);
		   }
		   else
		   {
			   result+=Character.toUpperCase(ch);
		   }
	   }
	   if(s.length()==result.length())
	   {
		   System.out.println(result);
	   }
//	   for(int i=0;i<=s.length()-1;i++)
//	   {
//		   char ch=s.charAt(i);
//		   result=ch+result;
//	   }
//	   
//	   System.out.println(result);
	}
}


