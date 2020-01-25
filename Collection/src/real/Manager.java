package real;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager
{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<Student>();

	public static void main(String[] args)
	{
		String ch = "";
		do
		{
			System.out
					.println("************STUDENT MANAGEMENT SYSTEM ********************");
			System.out.println("1.Add Student");
			System.out.println("2.Update Student");
			System.out.println("3.Delete Student");
			System.out.println("4.Display Student");
			System.out.println("5.Download");
			System.out.println("6.Search");
			System.out.println("7.Exit");
			System.out.println("Enter your choice (1-7)");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addStudents();
				break;
			case 2:
				updateStudents();
				break;
			case 3:
				deleteStudents();
				break;
			case 4:
				displayStudents();
				break;
			case 5:
				download();
				break;
			case 6:
				search();
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Enter the choice between 1-7");
				break;
			}
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("y"));
		System.out.println("Thanks!!!");
	}

	private static void search()
	{
		validateStudent("search");
	}

	private static void download()
	{
		
		
	}

	private static void displayStudents()
	{
		System.out.println("Here is the Details:");
		System.out.println("Total no of student = " + studentList.size());
		for (Student student : studentList)
		{

			System.out.println("Roll No = " + student.getRollNo());
			System.out.println("First Name = " + student.getfName());
			System.out.println("Last Name = " + student.getlName());
			System.out.println("Age = " + student.getAge());
			System.out.println("-----------------------------");

		}

	}

	private static void deleteStudents()
	{
		Student student = validateStudent("delete");
		if (student != null)
		{
			studentList.remove(student);
			System.out.println("Student deleted successfully!!!!");
		}

	}

	private static void updateStudents()
	{
		Student student = validateStudent("update");
		if (student != null)
		{
			System.out.println("Enter the new First name");
			String fName = sc.next();
			System.out.println("Enter the new Last name");
			String lName = sc.next();
			System.out.println("Enter the new Age");
			int age = sc.nextInt();
			student.setfName(fName);
			student.setlName(lName);
			student.setAge(age);
			System.out.println("Student updated successfully!!!!");

		}
	}

	private static Student validateStudent(String operation)
	{
		System.out.println("Enter the roll no you want to " + operation);
		int roll = sc.nextInt();
		Student stdnt = null;
		for (Student student : studentList)
		{
			if (student.getRollNo() == roll)
			{
				stdnt = student;
				break;
			}

		}
		if (stdnt != null)
		{

			System.out.println("You are available");
		} else
		{
			System.out.println("Please enter the correct roll no");
		}
		return stdnt;
	}

	private static void addStudents()
	{
		Student student = new Student();
		System.out.println("Enter the rolll no");
		int rollNo = sc.nextInt();
		System.out.println("Enter the First name");
		String fName = sc.next();
		System.out.println("Enter the last name");
		String lName = sc.next();
		System.out.println("Enter the age name");
		int age = sc.nextInt();
		student.setRollNo(rollNo);
		student.setfName(fName);
		student.setlName(lName);
		student.setAge(age);
		studentList.add(student);
	}
}
