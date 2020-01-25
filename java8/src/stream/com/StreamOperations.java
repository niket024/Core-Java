package stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamOperations {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		System.out.println("-----------------------");
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("-------------------------");
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println("Any Name start with A ? " + matchedResult);
		System.out.println("----------------------");
		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println("All Name start with A ? " + matchedResult);
		System.out.println("-----------------------");
		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println("No Name start with A ? " + matchedResult);

		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		System.out.println("--------------------------");
		// If no match then exception
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName);

	}
}
