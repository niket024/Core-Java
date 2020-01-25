import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Manager1
{
public static void main(String[] args) throws Exception
{
	Employee e1=new Employee("abc",123,34.56);
	File f1 = new File("emp.ser");
	FileOutputStream fout=new FileOutputStream(f1);
	ObjectOutputStream bout=new ObjectOutputStream(fout);
	e1.writeExternal(bout);
	bout.flush();
	bout.close();
	System.out.println("done");
}
}
