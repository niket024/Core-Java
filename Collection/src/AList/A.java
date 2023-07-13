package AList;

import java.util.ArrayList;
import java.util.Collections;

public class A
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("abd");
		list.add(123.90f);
		list.add(123.90);
		list.add('c');
		list.add(true);
		list.add(23);
		list.add(23);
		list.add(88888888l);
		list.add(3333);
		//Collections.sort(list);
		System.out.println(list);

	}
}
