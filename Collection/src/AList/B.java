package AList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class B
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(134);
		list.add(567);
		//list.add("hhh");
		list.add(90);
		list.add(88);
		list.add(88);
		list.add(56);
		list.add(56);
		System.out.println(list.get(3));
		System.out.println("before sorting");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting");
		System.out.println(list);
	}
}
