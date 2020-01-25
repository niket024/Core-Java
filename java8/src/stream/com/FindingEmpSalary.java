package stream.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingEmpSalary
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1, "abc", 1000);
		Employee e2 = new Employee(2, "aaae", 2000);
		Employee e3 = new Employee(3, "bbbbbbbbbb", 3000);
		Employee e4 = new Employee(4, "ccc88", 4000);
		Employee e5 = new Employee(5, "ddd", 5000);
		Employee e6 = new Employee(6, "wwww", 6000);
		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6);

		// In java 7
		System.out.println("Finding top 3 max salaried employee java 7");

		Collections.sort(empList, new Comparator<Employee>()
		{
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o2.getSalary() - o1.getSalary();
			}
		});

		for (int i = 0; i < 3; i++)
		{
			System.out.println(empList.get(i).getName() + " :"
					+ empList.get(i).getSalary());
		}
		// In java 8
		System.out.println("Finding top 3 max salaried employee java 8 way 1");

		empList.sort((o1, o2) -> o2.getSalary() - o1.getSalary());

		empList.stream().limit(3).forEach(e -> {
			System.out.println(e.getName() + ":" + e.getSalary());
		});
		// only salary without name
		System.out.println("Finding top 3 max salaried employee java 8 way 2");

		empList.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.limit(3).map(Employee::getSalary).forEach(System.out::println);
		System.out.println("------------------------------------------------");

		System.out.println("Unordered");
		Map<String, Integer> map1 = empList
				.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.limit(3)
				.collect(
						Collectors
								.toMap(Employee::getName, Employee::getSalary));
		System.out.println(map1);

		System.out.println("-------------------------------------------------");
		System.out.println("Ordered");
		Map<String, Integer> map2 = empList
				.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.limit(3)
				.collect(
						Collectors.toMap(Employee::getName,
								Employee::getSalary, (name, salary) -> salary,
								LinkedHashMap::new));
		System.out.println(map2);
		// filtering with employee name length
		System.out
				.println("Filtring 3 employee based upon length of the name and ma");
		Map<String, Integer> map3 = empList
				.stream()
				.filter(name -> name.getName().length() == 3)
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.limit(3)
				.collect(
						Collectors.toMap(Employee::getName,
								Employee::getSalary, (name, salary) -> salary,
								LinkedHashMap::new));
		System.out.println(map3);
		// Collecting the name of employee with comma separated

		String names = empList.stream().map(Employee::getName)
				.collect(Collectors.joining(","));
		System.out.println(names);

		// Finding employee id based upon name
		int id = empList.stream().filter(emp -> emp.getName().equals("ddd"))
				.findAny().get().getId();
		System.out.println("Employee id  = " + id);

	}
}
