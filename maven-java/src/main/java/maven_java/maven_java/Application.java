package maven_java.maven_java;

import java.io.IOException;

public class Application {

	public static String reverseString(String str) throws IOException {
		if (str != null) {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			System.out.println(rev);
		} else {
			System.out.println("String is null");
		}
		return new StringBuffer(str).reverse().toString();
	}

	public static int getSum(int n1, int n2) {
		return n1 + n2;
	}

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("‪C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		//System.out.println(Application.reverseString("abc"));

	}
}