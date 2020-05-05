
public class Test {
	public static void main(String[] args) {
		String input = "Ý100¨";
		String s1 = input.replaceAll("[^\\p{ASCII}]", " ");
		System.out.println(s1);
	}
}
