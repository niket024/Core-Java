package real;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager1
{
	public static void main(String[] args)
	{
		ArrayList<Employee1> empList = new ArrayList<Employee1>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employee");
		int no = sc.nextInt();
		Employee1 employee = null;
		for (int i = 0; i < no; i++)
		{
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the fname");
			String fname = sc.next();
			System.out.println("Enter the lname");
			String lname = sc.next();
			System.out.println("enter the age");
			int age = sc.nextInt();
			
			employee = new Employee1();
			employee.setId(id);
			employee.setfName(fname);
			employee.setlName(lname);
			employee.setAge(age);
			
			empList.add(employee);
		}
		/*
		 * for (int i = 0; i < empList.size(); i++) { Employee emp1 =
		 * empList.get(i); System.out.println(emp1); }
		 */
		System.out.println(empList.get(0).getId());
		System.out.println(empList.get(3).getId());

		for (Employee1 emp : empList)
		{
			System.out.println(emp.getId());
			System.out.println(emp.getfName());
			System.out.println(emp.getlName());
			System.out.println(emp.getAge());
			System.out.println("------------------------");
		}
		
		
		
		System.out.println("Enter the id which you want to update");
		int id1 = sc.nextInt();
		boolean avl = false;
		
		for (Employee1 emp : empList)
		{
			if(emp.getId() ==id1)
			{
				System.out.println("enter the new fname");
				emp.setfName(sc.next());
				System.out.println("enter the new lname");
				emp.setlName(sc.next());
				System.out.println("enter the new age");
				emp.setAge(sc.nextInt());
				avl =true;
				break;
			}
		}
		
		if(avl)
		{
			System.out.println("Id is available");
		}else{
			System.out.println("Id not is available");
		}
		
		System.out.println("Enter the id which you want to delete");
		int id2 = sc.nextInt();
		for (Employee1 emp : empList)
		{
			if(emp.getId() ==id2)
			{
				empList.remove(emp);
				System.out.println("Employee deleted successfully!!!");
			}
		}
		
	}
}
