package map;

import java.util.Hashtable;

public class B
{

	public static void main(String[] args)
	{
		Hashtable map = new Hashtable();
		map.put("k1", 67);
		map.put("k2", 34);
		// map.put(null, 34);
		map.put(23, 67);
		map.put("k5", 765);
		//map.put("k5", null);

		map.put(78.90, 12);
		map.put("null", 12);
		map.put("k1", 999999);
		System.out.println(map);
	}
}
