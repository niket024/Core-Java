package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * You can use filters to filter out sub-directories and print only file names, if you need it.
 */
public class FileListDemo2 {
	public static void main(String[] args) {
		try {
			Files.list(Paths.get(".")).filter(Files::isRegularFile).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
