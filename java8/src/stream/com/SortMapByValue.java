package stream.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 10);
		map.put("B", 2);
		map.put("C", 35);
		map.put("D", 4);
		map.put("E", 4);
		System.out.println("----------Java 8-------------");
		Map<String, Integer> reverse1 = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
		reverse1.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("reversed");
		Map<String, Integer> reverse2 = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
		reverse2.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
