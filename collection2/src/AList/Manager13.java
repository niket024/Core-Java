package AList;

import java.util.ArrayList;
import java.util.Collections;

class B3 implements Comparable
{
	int i;

	public B3(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{

		return "" + i;
	}

	@Override
	public int compareTo(Object obj)
	{
		B3 b1=(B3)obj;
		return this.i - b1.i;
	}
}
public class Manager13
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(new B3(100));
		list.add(new B3(10));
		list.add(new B3(45));
		list.add(new B3(89));
		list.add(new B3(0));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		B3 b1 = new B3(6);
		B3 b2 = new B3(69);
		System.out.println(b1.compareTo(b2));

	}
}
