package Instagram;

public class ReveseIngivenString {
public static void main(String[] args) {
	String s="Miracle";
//	String s1="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		System.out.print(ch);
	}
	
}
}
