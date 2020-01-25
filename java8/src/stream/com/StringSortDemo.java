package stream.com;

import java.util.Arrays;
import java.util.Collections;

public class StringSortDemo
{
	public static void main(String[] args)
	{

		String[] s = { "sort", "string", "array" };
		// java 7
		System.out.println("*******Java 7**************");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		// reverse order
		Arrays.sort(s, Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
		// java 8
		System.out.println("*******Java 8**************");
		Arrays.stream(s).sorted().forEach(System.out::println);
		// reverse order
		System.out.println();
		Arrays.stream(s).sorted(Collections.reverseOrder())
				.forEach(System.out::println);

	}
}
