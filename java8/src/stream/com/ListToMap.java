package stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(22);
		list.add(44);
		list.add(1);
		list.add(32);
		list.add(2);
		System.out.println(list);
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(map);
		
		Map<Integer, Long> map1 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);
	}
}
