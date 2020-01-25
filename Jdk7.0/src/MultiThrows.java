import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiThrows
{
	public static void main(String[] args) throws FileNotFoundException,
			InterruptedException, ClassNotFoundException
	{

		Thread.sleep(1000);
		Class.forName("A");
		throw new FileNotFoundException("FileNotFoundException");

	}
}
