package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *To list out only files and excluding all directories from stream, use path filter as second argument.
 */
public class FileListDemo4 {
	public static void main(String[] args) {
		try {
			Files.newDirectoryStream(Paths.get("."), path -> path.toFile().isFile())
	        .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
