package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Manager
{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> list = new ArrayList<Employee>();

	public static void main(String[] args)
	{
		String ch = "";
		do
		{
			System.out.println("**********Employee Details************");
			System.out.println("1.Add");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Display");
			System.out.println("5.sort based on id");
			System.out.println("6.Exit");
			System.out.println("Enter your choice(1-5)");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				addEmloyee();
				break;
			case 2:
				// updateEmloyee();
				break;
			case 3:
				deleteEmloyee();
				break;
			case 4:
				displayEmloyee();
				break;
			case 5:
				Collections.sort(list);
				System.out.println(list);
				break;
			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Its not a right choice...");
				break;
			}
			System.out.println("do you want to continue?(y/n)");
			ch = sc.next();
		} while ("y".equalsIgnoreCase(ch));
	}

	

	private static void deleteEmloyee()
	{
		System.out.println("enter the id of Employee which you want to delete");
		int id = sc.nextInt();
		boolean flag = false;
//		for (Employee e : list)
//		{
//			if (id == e.getId())
//			{
//				flag = true;
//				list.remove(e);
//			}
//		}
		Iterator<Employee> emp= list.iterator();//1,2
		while (emp.hasNext())
		{
			Employee employee = (Employee) emp.next();
			if (id == employee.getId())
			{
				flag = true;
				emp.remove();
			}
		}
		if(flag)
		{
			System.out.println("employye deleted successfully!!!!");
		} else
		{
			System.out.println("Id not exit...pls check");
		}

	}

	private static void displayEmloyee()
	{
		System.out.println(list);
		System.out.println("Here is the list of Employee");
		for (Employee e : list)
		{
			System.out.println("Id=" + e.getId());
			System.out.println("name=" + e.getName());
			System.out.println("Age=" + e.getAge());
			System.out.println("------------------------------");
		}

	}

	private static void addEmloyee()
	{
		Employee e1 = new Employee();
		System.out.println("****Add*****");
		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the age");
		int age = sc.nextInt();
		e1.setId(id);
		e1.setName(name);
		e1.setAge(age);
		list.add(e1);
		System.out.println("Employee added successfully!!!!");
	}
}
