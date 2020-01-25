import java.util.Arrays;

public class G
{
	public static void main(String[] args)
	{
		int y[] = { 12, 34, 45, 67, 't', 44, 67, 33,67};
		System.out.println(y[4]);

		Arrays.sort(y);
		System.out.println(Arrays.toString(y));

		int x = Arrays.binarySearch(y, 67);
		System.out.println(x);

	}
}
