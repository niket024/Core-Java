package stream.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileReadInJava8
{
	public static void main(String args[])
	{

		String fileName = "file.txt";
		// read file into stream, try-with-resources
		readFile(fileName);
		fileSearchAndCount(fileName);

	}

	private static void readFile(String fileName)
	{
		try (Stream<String> stream = Files.lines(Paths.get(fileName)))
		{
			stream.forEach(System.out::println);

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private static void fileSearchAndCount(String fileName)
	{
		try
		{
			Stream<String> stream1 = Files.lines(Paths.get(fileName));
			stream1.filter(str -> str.startsWith("nik")).forEach(
					System.out::println);
			
			Stream<String> stream2 = Files.lines(Paths.get(fileName));
			long count = stream2.flatMap(str -> Arrays.stream(str.split(" ")))
					.filter(str -> str.equals("try")).count();
			System.out.println(count);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
