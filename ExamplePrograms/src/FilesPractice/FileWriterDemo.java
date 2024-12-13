package FilesPractice;

import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
public static void main(String[] args) {
	
	try
	{
//	FileWriter f= new FileWriter("./remo1.txt");
//	String s="naidu";
//	f.write(s);
//	FileInputStream fr=new FileInputStream("./remo1.txt");
		FileReader fr=new FileReader("./remo1.txt");
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		while(br.readLine()!=null)
		{
			count++;
		}
		System.out.println(count);
		
//	int i;
//	Scanner sc = new Scanner(fr);
//	int count=0;
//	while(sc.hasNext())
//	{
//		System.out.println(sc.nextLine());
//		count++;
//	}
//	System.out.println(count);
//	while((i=fr.read())!=-1)
//	{
//		System.out.print((char)i);
//	}
	fr.close();
//	f.close();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}