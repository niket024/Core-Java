package map;

import java.util.HashMap;

class N
{
	int i;

	N(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{
		return "(i=" + i + ")";
	}
	@Override
	public boolean equals(Object obj)
	{
		return this.i==((N)obj).i;
	}
	@Override
	public int hashCode()
	{
		int hash=Integer.toString(i).hashCode();
		return hash;
	}
}

public class Manager4
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put(10, "abc");
		map.put(10, "xyz");
		map.put("k1", 200);
		map.put("k1", "test");
		map.put(new N(10), 100);
		map.put(new N(10), 200);
		System.out.println(map);

	}

}
