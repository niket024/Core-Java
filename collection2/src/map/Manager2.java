package map;

import java.util.HashMap;

class M
{
	int i;
	M(int i)
	{
		this.i=i;
	}
	@Override
	public String toString()
	{
		return "(i="+i+")";
	}
}
public class Manager2
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put(10, "abc");
		map.put(10, "xyz");
		map.put("k1", 200);
		map.put("k1", "test");
		map.put(new M(10), 100);
		map.put(new M(10), 200);
	  System.out.println(map);
		
	}
   
}
