package foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 4);

		HashMap<Integer, String> reverse = new HashMap<>();

		// Before java8
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
			reverse.put(entry.getValue(), entry.getKey());
		}
		System.out.println(reverse);

		// After java8
		System.out.println("------------Iterating by passing method reference---------------");
		map.forEach((k, v) -> System.out.println(k + "=" + v));
		
		System.out.println("------------------------------");
		
		map.entrySet().forEach(System.out::println);
		// or
		System.out.println("------------Iterating by passing method reference---------------");

		Consumer<Map.Entry<String, Integer>> action = System.out::println;
		map.entrySet().forEach(action);

		System.out.println("------------printing key by passing lambda expression---------------");
		map.keySet().forEach(key -> System.out.println(key));

		System.out.println("------------printing values by passing lambda expression---------------");
		map.values().forEach(val -> System.out.println(val));

		System.out.println("-------------Create custom action---------------");
		Consumer<Map.Entry<String, Integer>> action1 = entry -> {
			System.out.println("key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
			System.out.println("---------------------");
		};
		map.entrySet().forEach(action1);
	}
}
