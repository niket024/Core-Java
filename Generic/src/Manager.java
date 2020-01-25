
class C <x>
{
	x i;
}

public class Manager
{
	public static void main(String[] args)
	{
		C<String> c1 = new C<String>();
		c1.i = "abc";
		C<Integer> c2 = new C<Integer>();
		c2.i = 90;
		C<Double> c3 = new C<Double>();
		c3.i = 90.90;
		//c3.i="abc";
		System.out.println("done");
	}
}
