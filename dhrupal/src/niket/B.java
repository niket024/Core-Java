package niket;

public class B
{
	public int getSum(int a, int b)
	{
		return a + b;
	}

	static public void main(String... args)// Varagrs
	{
		B b1 = new B();
		System.out.println("Sum = " + b1.getSum(10, 20));
	}

}
