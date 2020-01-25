import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Manager
{
	public static void main(String[] args) throws Exception
	{
		A a1 = new A();
		a1.i = 90;
		a1.l = 90000l;
		a1.d = 890.90;
		a1.ch = 'a';
		a1.b1 = true;
		File f1 = new File("data.ser");
		FileOutputStream fout = new FileOutputStream(f1);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		fout.flush();
		out.close();
		fout.close();
		System.out.println("done");

	}
}
