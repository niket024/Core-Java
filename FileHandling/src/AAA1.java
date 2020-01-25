import java.io.File;
import java.io.IOException;

public class AAA1
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("C:\\test\\aa.txt");
		System.out.println(f1.createNewFile());
		File f2 = new File("C:\\test\\aaa.txt");
		System.out.println(f2.createNewFile());
		System.out.println("done");
	}
}
