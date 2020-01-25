package AList;

import java.util.ArrayList;
import java.util.Collections;

class B2
{
	int i;

	public B2(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{

		return "" + i;
	}
}

public class Manager12
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(56);
		list.add(77);
		list.add(new B2(100));
		list.add(new B2(10));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
