import java.io.IOException;
import java.io.PrintStream;


public class Manager 
{
public static void main(String[] args) throws IOException
{
	PrintStream p1=new PrintStream("log.txt");
	PrintStream p2=System.out;
	System.out.println(3);
	System.setOut(p1);
	try
	{
		int i=10/0;
	} catch (Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	System.out.println(6);
	System.setOut(p2);
	System.out.println(9);
}
}
