package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example
{

	public static void main(String[] args)
	{
		Map<String, Integer> total = new HashMap<String, Integer>();

		Map<String, Integer> saving = new HashMap<String, Integer>();
		saving.put("customer1", 2000);
		saving.put("customer2", 4000);
		saving.put("customer3", 6000);
		saving.put("customer5", 6000);

		Map<String, Integer> current = new HashMap<String, Integer>();
		current.put("customer1", 6000);
		current.put("customer2", 4000);
		current.put("customer3", 9000);
		current.put("customer4", 5000);

		getTotal(total, saving);
		getTotal(total, current);
		System.out.println(total);

	}

	private static void getTotal(Map<String, Integer> total,
			Map<String, Integer> balance)
	{
		Set<String> keys = balance.keySet();

		Iterator<String> it = keys.iterator();

		while (it.hasNext())
		{
			String key = it.next();
			if (total.get(key) == null)
			{
				total.put(key, balance.get(key));
			} else
			{
				Integer bal = total.get(key);
				total.put(key, balance.get(key) + bal);
			}
		}

	}
}
