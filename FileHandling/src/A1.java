import java.io.File;
import java.io.IOException;


public class A1
{
	public static void main(String[] args) throws IOException
	{
      File f1=new File("C:\\app1\\test1.xlsx");
      System.out.println(f1.createNewFile());
      System.out.println("done");
	}
}
