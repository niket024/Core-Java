import java.util.Scanner;

public class A
{
	final int i;

	A()
	{
		this.i =20;
	}
	A(int i)
	{
		this.i =i;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the i value");
		int i = sc.nextInt();
		A a1 = new A(i);
		System.out.println(a1.i);
	}
}
