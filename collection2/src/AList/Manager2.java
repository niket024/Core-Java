package AList;

import java.util.ArrayList;

public class Manager2
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
	list.add(234);
	System.out.println(list);
}
}
