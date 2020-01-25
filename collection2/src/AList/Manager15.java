package AList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class E 
{
	int i;
	int j;

	public E(int i,int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{

		return "(" + i+","+j+")";
	}
}
class G implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		E e1=(E)o1;
		E e2=(E)o2;
		return e1.i-e2.i;
	}
}
class H implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		E e1=(E)o1;
		E e2=(E)o2;
		return e1.j-e2.j;
	}
}

public class Manager15
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(new E(100,56));
		list.add(new E(3,46));
		list.add(new E(78,45));
		list.add(new E(2,90));
		list.add(new E(19,90));
		list.add(new E(21,77));

		System.out.println(list);
		
		Collections.sort(list,new G());
		System.out.println("based upon i value");
		System.out.println(list);

		System.out.println("based upon j value");
		Collections.sort(list,new H());
		System.out.println(list);

		

	}
}
