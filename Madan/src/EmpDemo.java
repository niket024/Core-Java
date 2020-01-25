import java.util.ArrayList;
import java.util.Scanner;

public class EmpDemo extends Employee
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");

		e1.setId(sc.next());
		System.out.println("enter your name");

		e1.setName(sc.next());
		System.out.println("enter your address");
//		ArrayList list = new ArrayList();
//		list.add(e1);
		

		e1.setAddress(sc.next());
		System.out.println("your details are:");
		//System.out.println(list);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
	}

}
