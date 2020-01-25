package stream.com;

import java.util.Optional;

/* Optional is an attempt to reduce the number of null pointer exceptions in Java systems,
 by adding the possibility to build more expressive APIs considering that sometimes return values are missing.
 If Optional was there since the beginning, today most libraries and applications would likely deal better with missing return values,
 reducing the number of null pointer exceptions and the overall number of bugs in general.
 By using Optional, user is forced to think about the exceptional case.
 Besides the increase in readability that comes from giving null a name,
 the biggest advantage of Optional is its idiot-proof-ness.
 It forces you to actively think about the absent case if you want your program to compile at all,
 since you have to actively unwrap the Optional and address that failure cases.
 */

public class OptionalExample {
	public static void main(String[] args) {
		// Assume this value has returned from a method
		Employee e1 = new Employee(1, "abc", 1000);

		Optional<Employee> EmployeeOptional1 = Optional.of(e1);
		Optional<Employee> EmployeeOptional2 = Optional.empty();

		// Now check optional; if value is present then return it,
		// else create a new Employee object and return it
		Employee employee1 = EmployeeOptional1.orElse(new Employee());
		System.out.println(employee1);
		Employee employee2 = EmployeeOptional2.orElse(new Employee());
		System.out.println(employee2);
		EmployeeOptional1.ifPresent(System.out::println);

		Employee e2 = new Employee(2, "xyz", 2000);

		Optional<Employee> EmployeeOptional3 = Optional.of(e2);
		EmployeeOptional3.filter(emp -> "xyz".equals(emp.getName())).ifPresent(emp -> System.out.println(emp));
		// It will not print anything because EmployeeOptional2 is empty
		EmployeeOptional2.ifPresent(System.out::println);

		// OR you can throw an exception as well
		EmployeeOptional2.orElseThrow(NullPointerException::new);
	}
}
