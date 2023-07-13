package pack1;

public class B {
	public static void main(String[] args) {
		System.out.println("main1");
		try {
			System.out.println("try");
			int i = 10 / 0;
		} catch (Exception ex) {
			System.out.println("catch");
		}

		System.out.println("main2");
	}
}
