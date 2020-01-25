import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Employee e1 = new Employee();
		System.out.println(e1);
		File f1 = new File("emp.ser");
		FileInputStream fin = new FileInputStream(f1);
		ObjectInputStream bin = new ObjectInputStream(fin);
		e1.readExternal(bin);
		System.out.println(e1.toString());
	}
}
