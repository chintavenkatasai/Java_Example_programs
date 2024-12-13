package CollectionPractice;

import java.util.*;

class Table 
{
	int row;
	int columns;
	String tablename;
	
	Table(int row,int columns,String tablename)
	{
		this.row=row;
		this.columns=columns;
		this.tablename=tablename;
	}
}
public class SaiPractice {
public static void main(String[] args) {
	ArrayList<Table> at=new ArrayList<>(Arrays.asList(
			new Table(3,5,"sai"),
			new Table(5,8,"vasu")));
	Iterator<Table> itr=at.iterator();
	
	while(itr.hasNext())
	{
		Table t=(Table)itr.next();
		System.out.println(t.row+" "+t.columns+" "+t.tablename);
	}
}
}

