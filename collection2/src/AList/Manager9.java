package AList;

import java.util.ArrayList;
import java.util.Collections;

public class Manager9
{
	public static void main(String[] args)
	{

		ArrayList list = new ArrayList();
		list.add("ABC");
		list.add("abc");
		list.add("aBC");
		list.add("abc");
		list.add("ABc");
		list.add("123");
		list.add("12A");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
