
public class B
{
	int i;
public static void main(String[] args) throws Exception
{
	B b1=new B();
	Object obj=new Object();
	Class c=b1.getClass();
	B b2=(B)c.newInstance();
	System.out.println(b2.i);
	Class C=Class.forName("B");
	B b3=(B)C.newInstance();
	System.out.println(b3.i);
	System.out.println(b3 instanceof Object);
}
}
