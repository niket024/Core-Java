package stream.com;

public class FunctionalProgrammingDemo {
	public static void main(String[] args) {
		// programming way
		int x = 90;
		String stmt = "";
		if (x > 50) {
			stmt = "heavy";
		} else {
			stmt = "Not heavy";
		}
		System.out.println(stmt);

		// expressive way
		System.out.println(x > 50 ? "heavy" : "not heavy");
	}
}
