import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class G
{
	public static void main(String[] args)
	{

		File f1 = new File("C:\\Niket\\IMG_20161009_214633.jpg");
		File f2 = new File("test1.jpg");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try
		{
			fin = new FileInputStream(f1);

			byte b[] = new byte[(int) f1.length()];

			fin.read(b);
			fout = new FileOutputStream(f2);

			fout.write(b);
			System.out.println("done");
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();
		} 
		finally
		{

			try
			{
				if (fout != null)
				{

					fout.close();
					fout = null;
				}
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}

			try
			{
				if (fin != null)
				{

					fin.close();
					fin = null;
				}
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
