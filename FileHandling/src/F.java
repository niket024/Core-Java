import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F
{
	public static void main(String[] args)
	{
		File f1 = new File(
				"C:\\Users\\niketk\\Desktop\\Capture.JPG");
		
		File f2 = new File("test1.jpg");
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		int i=90/0;
		try
		{
			fin = new FileInputStream(f1);
			bin = new BufferedInputStream(fin);
			byte b[] = new byte[(int) f1.length()];
			bin.read(b);
			fout = new FileOutputStream(f2);
			bout = new BufferedOutputStream(fout);
			bout.write(b);
			System.out.println("done");
		} catch (IOException ex)
		{
			
			ex.printStackTrace();
		}
		
		finally
		{
			try
			{
				if (bout != null)
				{
					bout.flush();
					bout.close();
					bout = null;
				}
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if (fout != null)
				{
					fout.flush();
					fout.close();
					fout = null;
				}
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if (bin != null)
				{

					bin.close();
					bin = null;
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
