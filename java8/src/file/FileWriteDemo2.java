package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriteDemo2 {
	public static void main(String[] args) {
		try {
			String content = "Another Hello World !!";
			Files.write(Paths.get("output.txt"), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
