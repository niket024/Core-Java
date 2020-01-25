package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachListCopy {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 6));
		// Before Java8
		// adding even no to other list
		List<Integer> list1 = new ArrayList<>();
		for (Integer i : list) {
			if (i % 2 == 0)
				list1.add(i);
		}
		System.out.println(list1);

		// After Java8
		// adding even no to other list
		System.out.println("------------Collecting even no into other list---------------");
		List<Integer> list2 = list.stream().filter(n -> n % 2 == 0) // finding even no.
				.collect(Collectors.toList());// collecting to list
		System.out.println(list2);
		
		System.out.println("------------Collecting even no into set---------------");
		Set<Integer> set = list.stream().filter(n -> n % 2 == 0) // finding even no.
				.collect(Collectors.toSet());// collecting to set
		System.out.println(set);
	}
}
