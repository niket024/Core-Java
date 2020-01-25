import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D
{
	public static void main(String[] args) throws IOException
	{
		// File f1=new File("test1.txt");
		FileWriter out = new FileWriter("test1.txt");
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("abc xyz welcome");
		bout.newLine();
		bout.write("abc xyz welcome");
		bout.newLine();
		bout.write("abc xyz welcome");
		bout.newLine();
		bout.write("abc xyz welcome");
		bout.newLine();
		bout.write("abc xyz welcome");
		bout.newLine();
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");
	}
}
