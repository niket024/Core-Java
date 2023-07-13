import java.util.Arrays;

public class G
{
	public static void main(String[] args)
	{
		int y[] = { 12, 34, 45, 67, 45, 44};

		Arrays.sort(y);
		System.out.println(Arrays.toString(y));

		int x = Arrays.binarySearch(y, 670);
		System.out.println(x);

	}
}
