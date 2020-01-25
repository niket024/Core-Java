package AList;

import java.util.ArrayList;
import java.util.Collections;

public class B
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(123);
		list.add(134);
		list.add(567);
		list.add(8);
		list.add(90);
		list.add(444);
		list.add(56);
		System.out.println("before sorting");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting");
		System.out.println(list);
	}
}
