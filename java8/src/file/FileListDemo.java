package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Files.list() method to list all file names and sub-directories in current directory.
 */
public class FileListDemo {
	public static void main(String[] args) {
		try {
			Files.list(Paths.get(".")).forEach(System.out::println);
			Files.list(Paths.get(".")).parallel().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
