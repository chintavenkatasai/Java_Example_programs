package SecondEvelution;

public class DuplicatesinTwoStringArrays {
public static void main(String[] args) {
	String s1[]= {"naidu","sai","Ranga","Naveen"};
	String s2[]= {"sai","Naveen","Swami","Venkey"};
	String s3="";
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i]==s2[j])
			{
			  s3=s3+s1[i]+" ";
			}
		}
	
	}
	System.out.println("Duplicates in the Strings :"+s3);
}
}
