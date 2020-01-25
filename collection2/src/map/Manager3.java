package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Manager3
{
	static HashMap total = new HashMap();

	public static void main(String[] args)
	{
		HashMap saving = new HashMap();
		saving.put("c1", 1000);
		saving.put("c2", 2000);
		saving.put("c3", 3000);
		HashMap current = new HashMap();
		current.put("c1", 6000);
		current.put("c2", 5000);
		current.put("c3", 2000);
		getTotal(saving);
		getTotal(current);
		System.out.println(total);
	}

	private static void getTotal(HashMap map)
	{
		Object key;
		Integer value;
		//Set set =map.keySet();
		Iterator it = map.keySet().iterator();
		while (it.hasNext())
		{
			key = it.next();
			value = (Integer) map.get(key);
			if (total.get(key) == null)
			{
				total.put(key, value);
			} else
			{
				Integer value1 = (Integer) total.get(key);
				total.put(key, value1 + value);
			}
		}
	}
}
