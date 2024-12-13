package FilesPractice;

import java.io.*;

public class Example2 {
public static void main(String[] args) throws Exception {
	
	
	FileOutputStream fo = new FileOutputStream("./naidu.txt");
	
	String s="Naidu Gari Abbailu";
	
	byte b[]=s.getBytes();
    fo.write(b);
    
    fo.close();
    
    FileInputStream fi=new FileInputStream("./naidu.txt");
    int i;
    while((i=fi.read())!=-1)
    {
    	System.out.print((char)i);
    }
}
}
