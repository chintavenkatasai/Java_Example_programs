package StringsSai;

import java.util.Scanner;

public class DeleteCharacter {
public static void main(String[] args) {
//	String S="naidugari";
//	String s1="";
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the Delete Character:");
//	char ch=sc.next().charAt(0);
//	for(int i=0;i<S.length();i++)
//	{
//		if(S.charAt(i)!=ch)
//		{
//			s1=s1+S.charAt(i);
//		}
//	}
//	
//	System.out.println(s1);
	
 
//   Scanner sc=new Scanner(System.in);
//   System.out.println("Enter the String:");
//   String S=sc.nextLine();
//  
//   int charcount=0;
//   for(int i=0;i<S.length();i++)
//   {
//	   if(S.charAt(i)!=' ')
//	   {
//		   charcount++;
//	   }
//   }
//   String[]word=S.split(" ");
//   int wordscount=word.length;
//   System.out.println("words count in given string: "+wordscount);
//   System.out.println("Character Count: "+charcount);
	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the String :");
//	String s=sc.nextLine();
//	String reverse="";
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		reverse=reverse+s.charAt(i);
//	}
//	System.out.println(reverse);
	
//	Scanner sc =new Scanner(System.in);
//	System.out.println("Enter the String:");
//	String s=sc.nextLine();
//	String w="";
//	String[] s1=s.split(" ");
//	String result="";
//	for(String s2:s1)
//	{
//		char ch=s2.charAt(0);
//		ch=Character.toUpperCase(ch);
//		w=s2.substring(1);
//		result=result+ch+w+" ";
//	}
//	System.out.println(result);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First String");
	String s1=sc.nextLine();
	System.out.println("Enter Second String");
	String s2=sc.nextLine();
	
	if(s1.equals(s2))
	{
		System.out.println("The Strings are Equal");
	}
	else
	{
		System.out.println("The String are Not Equal");
	}
	
}
}
