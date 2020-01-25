import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Students
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		FileWriter out = new FileWriter("students.txt");
		System.out.println("enter the no of students");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			System.out.println("students no:"+i);
			System.out.println("enter the roll no.");
			int roll = sc.nextInt();
			out.write("\nRoll no="+roll);
			System.out.println("enter the name");
			String name=sc.next();
			out.write("\nName="+name);
			out.write("\n------------------------\n");
		}
		out.flush();
		out.close();
		System.out.println("your registartion is done you can download!!!");
	}
}
