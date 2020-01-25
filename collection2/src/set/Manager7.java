package set;

import java.util.TreeSet;

class J
{
	int x;
	J(int x)
	{
		this.x=x;
	}
	@Override
	public String toString()
	{
		return "x="+x;
	}
}
public class Manager7
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet();
		set.add(new J(45));
		set.add(new J(8));
		set.add(new J(67));
		set.add(new J(5));
		set.add(new J(90));
		System.out.println(set);
	}
	
}
