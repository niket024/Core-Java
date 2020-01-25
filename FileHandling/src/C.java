import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class C
{
	public static void main(String[] args)
	{
		try
		{
			File f1 = new File("test11.txt");
			FileReader fr = new FileReader(f1);
			int len = (int) f1.length();
			System.out.println(len);
			char x[] = new char[len];
			fr.read(x);
			fr.close();
			System.out.println(x);
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}

	}
}
