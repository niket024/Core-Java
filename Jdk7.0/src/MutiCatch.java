import java.io.FileNotFoundException;
import java.io.IOException;

public class MutiCatch
{
	public static void main(String[] args)
	{

		try
		{
			Thread.sleep(1000);
			Class.forName("A");
			throw new FileNotFoundException("FileNotFoundException");

		} catch (FileNotFoundException | InterruptedException
				| ClassNotFoundException ex)
		{

			ex.printStackTrace();

		}
	}
}
