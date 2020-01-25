package AList;

import java.util.ArrayList;

class A1
{ 
	int i;
	public A1(int i)
	{
		this.i=i;
 	}
}
public class Manager10
{

	public static void main(String[] args)
	{

		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(56);
		list.add(77);
		list.add(new A1(100));
		list.add(new A1(10));
		System.out.println(list);

	
	}
	
}
