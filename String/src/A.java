public class A
{
	int i;

	A(int i)
	{
		this.i = i;
	}

	public static void main(String[] args)
	{
		A a1 = new A(12);
		System.out.println(a1);
		A a2 = new A(12);
		System.out.println(a2);
		System.out.println(a1 == a2);

		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "ABC";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
