package file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteDemo {
	public static void main(String[] args) {
		// Get the file reference
		Path path = Paths.get("output.txt");

		// Use try-with-resource to get auto-Closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write("Hello World !!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");
System.out.println(Math.pow(2,1));
	}
}
