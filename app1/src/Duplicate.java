import java.util.Arrays;

public class Duplicate
{
	public static void main(String[] args)
	{
		int arr[] = { 12, 34, 34, 45, 56, 67, 78 };
		int end = arr.length;

		for (int i = 0; i < end; i++)
		{
			for (int j = i + 1; j < end; j++)
			{
				if (arr[i] == arr[j])
				{
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++)
					{
						arr[shiftLeft] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] whitelist = new int[end];
		for (int i = 0; i < end; i++)
		{
			whitelist[i] = arr[i];
			System.out.println(Arrays.toString(arr));
		}

	}
}
