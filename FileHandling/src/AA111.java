import java.io.File;
import java.io.IOException;


public class AA111
{
	public static void main(String[] args) throws IOException
	{
      File f1=new File("C:\\app1\\abc\\xyz\\aaa\\bbb");
      System.out.println(f1.mkdirs());
      System.out.println("done");
	}
}
