package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		// Before Java8
		for (Integer i : list) {
			System.out.println(i);
		}
		// After Java8
		System.out.println("------------Iterating by passing method reference---------------");

		list.forEach(System.out::println);
		// or
		System.out.println("------------Iterating by passing method reference---------------");

		Consumer<Integer> action = System.out::println;
		list.forEach(action);
		// or
		System.out.println("------------Iterating by passing lambda expression---------------");
		list.forEach(list1 -> System.out.println(list1));
		// or
		System.out.println("--------------");
		list.stream().forEachOrdered(l -> System.out.println(l));

	}
}
