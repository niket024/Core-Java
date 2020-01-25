public class H
{
	public static void main(String[] args)
	{

		int x[][] = new int[3][3];
		x[0][0] = 20;
		x[0][1] = 40;
		x[0][2] = 40;
		x[1][0] = 80;
		x[1][1] = 760;
		x[1][2] = 760;
		x[2][0] = 77;
		x[2][1] = 88;
		x[2][2] = 88;
		int sum = 0;
		/*for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				if (i == j)
				{
					sum = sum + x[i][j];
				}
				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}*/
		for (int i = 0,j=2; i < x.length; i++,j--){
			System.out.println(x[i][j]);
		}
		System.out.println("sum=" + sum);
	}
}
