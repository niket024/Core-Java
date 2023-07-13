package real;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepo {
	public static List<Employee> employees = new ArrayList<>();

	public void processEmployee(int choice, Scanner sc) {
		switch (choice) {
		case 1:
			addEmployee(sc);
			break;
		case 2:
			updateEmployee(sc);
			break;
		case 3:
			deleteEmployee(sc);
			break;
		case 4:
			getEmployees();
			break;
		case 5:
			System.out.println("Thanks for using Employee management");
			System.exit(0);
			break;

		default:
			System.out.println("Please enter the the value between (1-5)");
			break;
		}

	}

	private void getEmployees() {
		int size = employees.size();
		System.out.println("Total no. of employee is = " + size);
		if (size > 0) {
			System.out.println("Here are the details:");
			for (Employee emp : employees) {
				System.out.println("EmpId = " + emp.getEmpId());
				System.out.println("Emp Name = " + emp.getName());
				System.out.println("Emp Age = " + emp.getAge());
				System.out.println("Emp Salary = " + emp.getSalary());
				System.out.println("---------------------------------------");
			}

		}
	}

	private void deleteEmployee(Scanner sc) {
		boolean isFound = false;
		System.out.println("Enter the empId which you want to delete");
		int id = sc.nextInt();
//		Employee employee = employees.stream().filter(e -> e.getEmpId() == id).findFirst().get();
//		employees.remove(employee);
		isFound = employees.removeIf(e -> e.getEmpId() == id);
		/*
		 * for (Employee employee : employees) { if (employee.getEmpId() == id) {
		 * isFound = true; employees.remove(employee); break; } }
		 */
		if (isFound) {
			System.out.println("Employe with id = " + id + " Deleted successfullyl̥");
		} else {
			System.out.println("Employee with id = " + id + " Not found in records");
		}

	}

	private void updateEmployee(Scanner sc) {
		boolean isFound = false;
		System.out.println("Enter the empId which you want to update");
		int id = sc.nextInt();
		for (Employee employee : employees) {
			if (employee.getEmpId() == id) {
				isFound = true;
				System.out.println("Enter the new name");
				employee.setName(sc.next());
				System.out.println("Enter the new age");
				employee.setAge(sc.nextInt());
				System.out.println("Enter the new salary");
				employee.setSalary(sc.nextInt());
				break;
			}
		}
		if (isFound) {
			System.out.println("Employe with id = " + id + " Updated successfullyl̥");
		} else {
			System.out.println("Employee with id = " + id + " Not found in records");
		}

	}

	private void addEmployee(Scanner sc) {
		System.out.println("Enter the emp id");
		int empId = sc.nextInt();
		System.out.println("Enter the emp name");
		String name = sc.next();
		System.out.println("Enter the emp age");
		int age = sc.nextInt();
		System.out.println("Enter the emp salary");
		int salary = sc.nextInt();
		Employee employee = new Employee(empId, name, age, salary);
		employees.add(employee);
		System.out.println("Employe with id " + empId + " Created successfully");
		System.out.println(employee);

	}

}
