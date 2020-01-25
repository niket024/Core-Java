import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Manager1
{
	public static void main(String[] args) throws Exception
	{
		File f1 = new File("data.ser");
		FileInputStream fin = new FileInputStream(f1);
		ObjectInputStream in = new ObjectInputStream(fin);
		A a1 = (A) in.readObject();
		System.out.println(a1.i);
		System.out.println(a1.l);
		System.out.println(a1.d);
		System.out.println(a1.ch);
		System.out.println(a1.b1);
		System.out.println("done");
	}
}
