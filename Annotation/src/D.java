public class D extends C
{
	public static void main(String[] args)
	{
		Thread t1=new Thread();
		t1.stop();
		D d1 = new D();
		d1.test();
	}
}
