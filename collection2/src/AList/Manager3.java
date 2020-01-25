package AList;

import java.util.ArrayList;

public class Manager3
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
	ArrayList list1 = new ArrayList(); 
	list1.add(123);
	list1.add(45);
	list1.addAll(list);
	System.out.println("--------------");
	System.out.println(list1);
	
}
}
 