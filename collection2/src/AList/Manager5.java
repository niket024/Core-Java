package AList;

import java.util.ArrayList;

public class Manager5
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(12);
	list.add(56);
	list.add(77);
	list.add(99);
	list.add(76);
	list.add(55);
	list.add(43);
	System.out.println(list);
	boolean flag=list.remove(new Integer(55));
	System.out.println(flag);
	System.out.println(list);
}
}
