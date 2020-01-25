import java.io.File;
import java.io.IOException;

public class A11
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test1.txt");
		if (!f1.exists())
		{
			System.out.println(f1.createNewFile());
		} 
		else
		{
			System.out.println("file exist");
		}
	}
}
