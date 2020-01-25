package AList;

import java.util.ArrayList;

class B1
{
	int i;

	public B1(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{

		return "" + i;
	}
}

public class Manager11
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(56);
		list.add(77);
		list.add(new B1(100));
		list.add(new B1(10));
		System.out.println(list);
	}
}
