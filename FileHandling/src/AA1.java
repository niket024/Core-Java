import java.io.File;
import java.io.IOException;


public class AA1
{
	public static void main(String[] args) throws IOException
	{
      File f1=new File("test2");
      System.out.println(f1.mkdir());
      File f2=new File("C:\\test2\\test.txt");

      System.out.println(f2.createNewFile());
      System.out.println("done");
	}
}
