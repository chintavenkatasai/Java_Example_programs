package FilesPractice;

import java.io.*;

public class Example1 {
public static void main(String[] args)throws Exception {
	File f=new File("./ranga.txt");
	
	f.createNewFile();
	
	FileOutputStream fo=new FileOutputStream(f);
	String s="Welcome";
	byte b[]=s.getBytes();
	fo.write(b);
	fo.close();
	
	
	FileInputStream fi=new FileInputStream(f);
	int i;
	while((i=fi.read())!=-1)
	{
		System.out.print((char)i);
	}
	
}
}
