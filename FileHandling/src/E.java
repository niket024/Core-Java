
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E
{
	public static void main(String[] args) throws IOException
	{
		
		FileReader in = new FileReader("test1.txt");
		BufferedReader bin = new BufferedReader(in);
		String s1 = bin.readLine();
		if (s1 == null)
		{
			System.out.println("empty file");
			return;

		}
		while (s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
		bin.close();
		in.close();

	}
}
