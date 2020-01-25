package set;

import java.util.TreeSet;

class K implements Comparable
{
	int x;

	K(int x)
	{
		this.x = x;
	}

	@Override
	public String toString()
	{
		return "x=" + x;
	}

	@Override
	public int compareTo(Object o)
	{

		return this.x - ((K) o).x;
	}
}

public class Manager8
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		//int j=new K(34).compareTo(new K(7));
		//System.out.println(j);
		set.add(new K(45));
		set.add(new K(8));
		set.add(new K(67));
		set.add(new K(5));
		set.add(new K(90));
		System.out.println(set.toString());

	}

}
