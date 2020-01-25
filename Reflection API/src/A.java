import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A
{
	int i = 90;

	void test()
	{
		
	}
	public static void main(String[] args) throws Exception
	{
		A a2 = new A();
		
		Class c = Runnable.class;
		System.out.println(c.toString());
		System.out.println(c.getName());
		
		Class d = Class.forName("A");
		A a=(A)d.newInstance();
		System.out.println(a2==a);
		System.out.println(d.getSuperclass());
		System.out.println(d.getModifiers());
		System.out.println(d.isInterface());
		Field f1[]=d.getDeclaredFields();
		System.out.println(Arrays.toString(f1));
		Method  m1[]=d.getDeclaredMethods();
		System.out.println(Arrays.toString(m1));
	}
}
