package foreach;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindingSumOfSquareDemo {
	public static void main(String[] args) {
		// 1st way
		int sum = IntStream.range(0, 5).map(i -> i * i).sum();
		System.out.println(sum);

		// 2nd way
		List<Integer> list1 = IntStream.range(0, 5).boxed().collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(getSum(list1, 0));
		System.out.println(getSum1(list1, 0));
		IntStream it = list1.stream().mapToInt(Integer::intValue);
		System.out.println(it.map(i -> i * i).sum());
		// finding sum of square in other list
		List<Integer> list2 = list1.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(list2);
		
	}

	private static int getSum1(List<Integer> list, int i) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int j = it.next();
			sum += j * j;
		}
		return sum;

	}

	static int getSum(List<Integer> list, int index) {
		if (index == list.size()) {
			return 0;
		} else {
			return list.get(index) * list.get(index) + getSum(list, index + 1);
		}
	}
}
