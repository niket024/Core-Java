import java.io.File;
import java.io.IOException;

public class A11
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test.txt");
		boolean isFileExist = f1.exists();
		if (!isFileExist)
		{
			System.out.println(f1.createNewFile());
		} 
		else
		{
			System.out.println("file exist");
		}
	}
}
