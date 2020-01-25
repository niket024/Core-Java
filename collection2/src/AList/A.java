package AList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		System.out.println("abc".split(",")[0]);
		list.add(123);
		list.add("abd");
		list.add(123.90);
		list.add('c');
		list.add(true);
		list.add(2.3f);
		list.add(23);
		list.add(88888888l);
		list.add(3333);
		Collections.unmodifiableCollection(list).add(34);
		System.out.println(list.remove(3));

	}
}
