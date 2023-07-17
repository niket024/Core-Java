package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	Scanner sc = new Scanner(System.in);
	static List<Employee> employees = new ArrayList<>();

	public void addEmployee() {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		Employee e1 = new Employee(id, name, age, salary);
		employees.add(e1);
		System.out.println("Employee with id " + id + " added successfully!");
	}

	public void listEmployee() {
		System.out.println("*******Employee details*******");
		for (Employee employee : employees) {

			System.out.println("Id = " + employee.getId());
			System.out.println("Name = " + employee.getName());
			System.out.println("Age = " + employee.getAge());
			System.out.println("Salary = " + employee.getSalary());
			System.out.println("-------------------------------");
		}
	}

	public void updateEmployee() {
		System.out.println("Enter the id which you want to update");
		int id = sc.nextInt();
		boolean isEmpExist = false;
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				isEmpExist = true;
				System.out.println("Enter the new name");
				String name = sc.next();
				System.out.println("Enter the new age");
				int age = sc.nextInt();
				System.out.println("Enter the new salary");
				int salary = sc.nextInt();
				employee.setName(name);
				employee.setAge(age);
				employee.setSalary(salary);
				System.out.println("Employee with id " + id + " updated successfully!");
				break;
			}
		}
		if(!isEmpExist) {
			System.out.println("Employee with id " + id + " doesn't exist!");
		}

	}

	public void deleteEmployee() {
		System.out.println("Enter the id which you want to delete");
		int id = sc.nextInt();
		boolean isEmpExist = false;
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				isEmpExist = true;
				employees.remove(employee);
				System.out.println("Employee with id " + id + " deleted successfully!");

				break;
			}
		}
		if(!isEmpExist) {
			System.out.println("Employee with id " + id + " doesn't exist!");
		}
		
	}

	public void addEmployees() {
		System.out.println("Under construction");
		
	}
}
