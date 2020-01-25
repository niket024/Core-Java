import java.io.FileWriter;
import java.io.IOException;

public class B1
{
	public static void main(String[] args) throws IOException
	{

		FileWriter out = new FileWriter("test11.txt", true);
		out.append("welcome u all to the java classes\n");
		out.append("welcome u all to the java classes\n");
		out.append("welcome u all to the java classes\n");
		out.flush();
		out.close();
		System.out.println("done");

	}
}
