package privatemethod;

import java.lang.reflect.Method;

public class Don
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("privatemethod.A");
		Object obj = c.newInstance();
		Method m = c.getDeclaredMethod("method", null);
		m.setAccessible(true);
		m.invoke(obj, null);

		Method m1 = c.getDeclaredMethod("method", new Class[] { int.class });
		m1.setAccessible(true);
		m1.invoke(new A(), 4);
	}
}
