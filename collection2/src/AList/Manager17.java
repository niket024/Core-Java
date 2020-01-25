package AList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager17
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
	
	ListIterator lit=list.listIterator();
	System.out.println();
	while(lit.hasNext())
	{
		System.out.print(lit.next()+",");
	}
	System.out.println();
	while(lit.hasPrevious())
	{
		System.out.print(lit.previous()+",");
	}
	System.out.println();
	while(lit.hasNext())
	{
		System.out.print(lit.next()+",");
	}
}
}
