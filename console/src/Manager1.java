import java.io.IOException;
import java.io.PrintStream;


public class Manager1
{
	public static void main(String[] args) throws IOException
	{
		PrintStream p1=new PrintStream("hello1.txt");
		System.setOut(p1);
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
		System.out.println("hello to all");
	}
}
