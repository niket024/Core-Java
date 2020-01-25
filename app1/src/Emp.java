import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Emp
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		List<String> list = null;

		do
		{
			System.out.println("1.Enter details");
			System.out.println("2.display");
			System.out.println("3.modification");

			System.out.println("4.exit");
			System.out.println("enter your choice");
			int n = sc.nextInt();
			if (n == 1)
			{
				list = new ArrayList<String>();
				System.out.println("enter the id");
				list.add(sc.next());
				System.out.println("enter the name");
				list.add(sc.next());
				System.out.println("enter the Address");
				list.add(sc.next());
				System.out.println("enter the mobile");
				list.add(sc.next());
			}
			if (n == 2)
			{
				// System.out.println(list);
				System.out.println("your details are:");
				System.out.println("Id:" + list.get(0));
				System.out.println("Name:" + list.get(1));
				System.out.println("Address:" + list.get(2));
				System.out.println("Mobile:" + list.get(3));
			}
			if (n == 3)
			{
				System.out.println("enter the id which you want to modify");
				String id = sc.next();
				if ((list.get(0)).equals(id))
				{
					list = new ArrayList<String>();
					System.out.println("enter the new name ");
					list.add(id);
					list.add(sc.next());
					System.out.println("enter the new address");
					list.add(sc.next());
					System.out.println("enter the new mobile no");
					list.add(sc.next());
					System.out
							.println("your modification is done successfully!!!");
				}
				else
				{
					System.out.println("sorry this id is not available");
				}
			}
			if (n == 4)
			{
				System.out.println("thanks!!");
				System.exit(0);
			}
			System.out.println("do you want continue(y/n)?");
		} while ("y".equalsIgnoreCase(sc.next()));

	}
}
