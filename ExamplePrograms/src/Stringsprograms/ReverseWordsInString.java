package Stringsprograms;

public class ReverseWordsInString 
{
public static void main(String[] args) 
{
	String s ="i am sai naidu";
    String word[] = s.split(" ");
    
    for(int i=word.length-1;i>=0;i--)
    {
    	System.out.print(word[i]+" ");
    }
}
}
