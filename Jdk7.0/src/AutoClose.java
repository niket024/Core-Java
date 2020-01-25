import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AutoClose
{
	public static void main(String[] args) throws IOException
	{

		try (InputStream in = new FileInputStream("Koala.jpg");
				OutputStream out = new FileOutputStream("test1.jpg"))
		{
			byte b[] = new byte[1000];

			while (in.read(b) >= 0)
			{
				out.write(b);
			}
			close1(in);
		} catch (IOException ex)
		{

			ex.printStackTrace();
		}
		// here no need to close the resourse ,here we r achieving autoclose
		System.out.println("done");
	}

	static void close1(InputStream in1)
	{
		if (in1 != null)
		{
			System.out.println("close");
		}
	}

}
