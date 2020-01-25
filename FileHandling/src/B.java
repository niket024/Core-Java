import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class B
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test11.txt");
		FileWriter out = new FileWriter(f1);
		out.write("welcome u all to the java classes\n");
		out.write("welcome u all to the java classes\n");
		out.write("welcome u all to the java classes\n");
		out.flush();
		out.close();
		System.out.println("done");

	}
}
