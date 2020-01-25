package AList;

import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable
{
	int i;
	int j;

	public D(int i,int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{

		return "(" + i+","+j+")";
	}

	@Override
	public int compareTo(Object obj)
	{
		//return i - ((D) obj).i;
		return j - ((D) obj).j;
	}
}

public class Manager14
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(new D(100,56));
		list.add(new D(3,90));
		list.add(new D(78,45));
		list.add(new D(2,90));
		list.add(new D(19,90));
		list.add(new D(3,77));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

	}
}
