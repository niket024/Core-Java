package set;

import java.util.Comparator;
import java.util.TreeSet;

class L
{
	int i, j;

	L(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{
		return "(" + i + "," + j+")";
	}

	static class A implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2)
		{
			L obj1 = (L) o1;
			L obj2 = (L) o2;
			return obj1.i - obj2.i;
		}
	}

	static class B implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2)
		{
			L obj1 = (L) o1;
			L obj2 = (L) o2;
			return obj1.j - obj2.j;
		}
	}
}

public class Manager9
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet(new L.A());
		set.add(new L(45,7));
		set.add(new L(8,89));
		set.add(new L(67,9));
		set.add(new L(5,3));
		set.add(new L(90,6));
		System.out.println(set);
		TreeSet set1 = new TreeSet(new L.B());
		set1.add(new L(45,7));
		set1.add(new L(8,89));
		set1.add(new L(67,9));
		set1.add(new L(5,3));
		set1.add(new L(90,6));
		System.out.println(set1);

	}

}
