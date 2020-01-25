package comparable;

import java.util.Scanner;

public class ProgramsToReversMatrix
{
	public static void main(String[] args)
	{
		int array1row, array1column, array2row, array2Column;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size of array");
		array2Column = array1row = sc.nextInt();
		System.out.println("Enter the Column size of array");
		array2row = array1column = sc.nextInt();

		int a[][] = new int[array1row][array1column];
		int count = 1;
		for (int i = 0; i < array1row; i++)
		{
			for (int j = 0; j < array1column; j++)
			{
				a[i][j] = count++;

			}
		}

		for (int i = 0; i < array1row; i++)
		{
			for (int j = 0; j < array1column; j++)
			{
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("Printing Array in reverse order");
		int b[][] = new int[array2row][array2Column];
		for (int i = 0; i < array2row; i++)
		{
			for (int j = 0; j < array2Column; j++)
			{
				b[i][j] = a[j][i];

			}
		}

		for (int i = 0; i < array2row; i++)
		{
			for (int j = 0; j < array2Column; j++)
			{
				System.out.print(b[i][j] + " ");

			}
			System.out.println();
		}

	}
}
