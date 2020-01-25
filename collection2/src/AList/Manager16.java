package AList;

import java.util.ArrayList;
import java.util.Iterator;
public class Manager16
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
	
	while(it.hasNext())
	{
		System.out.println(it.next()+",");
	}
	//only one time element will be iterate
	//here we will not get second time o/p.
	while(it.hasNext())
	{
		System.out.print(it.next()+",");
	}

}
}
