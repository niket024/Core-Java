import java.util.Scanner;

public class Switch
{
	public static void main(String[] args)
	{
		String JAVA5 = "Java 5";

		String JAVA6 = "Java 6";

		String JAVA7 = "Java 7";

		Scanner sc = new Scanner(System.in);
		System.out
				.println("enter your choice from \n1. JAVA5\n2.JAVA6\n2.JAVA7\n");
		final String param = sc.next();
		switch (param)// if u pass string literals bello  jdk1.7 in switch u
						// will get CTE(try to change version)
		{

		case "JAVA5": {

			System.out.println("YOUR CHOICE IS:" + JAVA5);

			break;
		}
		case "JAVA6":

			System.out.println("YOUR CHOICE IS:" + JAVA6);

			break;
		case "JAVA7":

			System.out.println("YOUR CHOICE IS:" + JAVA7);

			break;
		}
	}
}
