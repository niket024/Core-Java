package real;

import java.util.Scanner;

public class EmpManager {

	public static void main(String[] args) {
		String ch = "";
		Scanner sc = new Scanner(System.in);
		EmployeeRepo employeeRepo = new EmployeeRepo();
		do {
			System.out.println("********Employee Management************");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Get Employees");
			System.out.println("5. Exit");
			System.out.println("Enter your choice (1-5)");
			int choice = sc.nextInt();
			employeeRepo.processEmployee(choice, sc);
			System.out.println("Do you want to continue? (Y/N)");
			ch = sc.next();
		} while ("Y".equalsIgnoreCase(ch));
		sc.close();
		System.out.println("Thanks!!!!");
	}


//SOLID
}
