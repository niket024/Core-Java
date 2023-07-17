package example;

import java.util.Scanner;

public class HrOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		EmployeeService employeeService = new EmployeeService();

		do {
			menu(sc, employeeService);
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.next();
		} while ("y".equalsIgnoreCase(ch));
		System.out.println("Thanks!!!");
	}

	// CRUD
	private static void menu(Scanner sc, EmployeeService employeeService) {
		System.out.println("********Employee Management********");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. List Employee");
		System.out.println("5. Add Employee in bulk");
		System.out.println("6. Exit");
		System.out.println("Enter your choice(1-5)");
		String choice = sc.next();
		switch (choice) {
		case "1":
			employeeService.addEmployee();
			break;
		case "2":
			employeeService.updateEmployee();
			break;
		case "3":
			employeeService.deleteEmployee();
			break;
		case "4":
			employeeService.listEmployee();
			break;
		case "5":
			System.out.println("Thanks!! for using HR portal");
			System.exit(0);
			break;
		case "6":
			System.out.println("Thanks!! for using HR portal");
			System.exit(0);
			break;

		default:
			System.out.println("Oops! thats not the right choice");
			break;
		}

	}
}
