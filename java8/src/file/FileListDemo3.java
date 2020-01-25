package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Java provides a more flexible way of traversing a directory content using Files.newDirectoryStream().
 * Please note that if we’re working with a large directory, then using DirectoryStream actually make code faster.
 */
public class FileListDemo3 {
	public static void main(String[] args) {
		try {
			Files.newDirectoryStream(Paths.get("."))
	        .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
