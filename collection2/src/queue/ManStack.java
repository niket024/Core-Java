package queue;

import java.util.LinkedList;

class Stack
{
	private LinkedList list = new LinkedList();

	public void add(Object obj)
	{
		list.add(obj);
	}

	public Object processElement()
	{
		return list.removeLast();
	}

	public String toString()
	{

		return list.toString();
	}
	
}
public class ManStack
{
public static void main(String[] args)
{
	Stack s1=new Stack();
	s1.add(12);
	s1.add("abc");
	s1.add("xyz");
	s1.add(4);
	s1.add(56);
	System.out.println(s1);
	Object o1=s1.processElement();
	System.out.println(o1);;
	System.out.println(s1);
	Object o2=s1.processElement();
	System.out.println(o2);;
	System.out.println(s1);
}
}
