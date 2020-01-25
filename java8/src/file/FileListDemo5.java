package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *You can change the path filter expression passed in second argument to get files of certain extension only.
 */
public class FileListDemo5 {
	public static void main(String[] args) {
		try {
			Files.newDirectoryStream(Paths.get("."), path -> path.toString().endsWith(".txt"))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
