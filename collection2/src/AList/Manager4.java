package AList;

import java.util.ArrayList;

public class Manager4
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(23);
	list.add("ancv");
	list.add(23.89);
	list.add(238);
	list.add(true);
	System.out.println(list);
	Object obj=list.remove(3);
	System.out.println(obj);
	System.out.println(list);
}
}
