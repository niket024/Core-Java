package AList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager20
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(5);
	list.add(56);
	list.add(6);
	list.add(9);
	list.add(21);
	list.add(77);
	System.out.println(list);
	System.out.println("----------------");
	Iterator it=list.iterator();
	//list.add(45);
	
	while(it.hasNext())
	{
		System.out.print(it.next()+",");
	}
	list.add(45);
	System.out.println();
	System.out.println(list);
}
}
