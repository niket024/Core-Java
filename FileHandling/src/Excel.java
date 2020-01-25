import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Excel
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		FileWriter out = new FileWriter("student.txt");
		out.write("*****Students Details******\n");
		System.out.println("enter the no of students");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			System.out.println("enter the name");
			out.write("FirstName="+sc.next()+"\n");
			System.out.println("enter the roll no");
			out.write("Roll No="+sc.nextInt()+"\n");
			out.write("----------------------\n");
		}
		out.flush();
		out.close();
		System.out.println("your file is ready!!!");
	}
}
