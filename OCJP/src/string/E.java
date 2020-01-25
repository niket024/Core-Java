package string;

public class E
{
	public static void main(String[] args)
	{
		System.out.printf("---%d---%d", 4, 5);
		System.out.println("");
		System.out.printf("---%1$d---%2$d", 4, 5);
		System.out.println("");
		System.out.printf("---%2$d---%1$d", 4, 5);
		System.out.printf("---%2$s---%1$s", "abc", "xyz");

	}
}
