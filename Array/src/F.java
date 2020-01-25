import java.util.Arrays;

public class F
{
	public static void main(String[] args)
	{
		int y[] = { 12, 34, 45, 67, 55, 44, 33 };
		System.out.println("before sorting");
		System.out.println(Arrays.toString(y));

		Arrays.sort(y);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(y));
	}
}
