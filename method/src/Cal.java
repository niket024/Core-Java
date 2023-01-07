public class Cal {

	void welcome() {
		System.out.println("Welcome to the calculator program");
		System.out.println("Learning java is awesome");
	}

	void add() {
		int n1 = 10;
		int n2 = 20;
		System.out.println("Sum = " + (n1 + n2));

	}

	void sub(int n1, int n2) {
		System.out.println("Diff = " + (n1 - n2));
	}

	int mul() {
		int n1 = 10;
		int n2 = 34;
		return n1 * n2;

	}

	int div(int n1, int n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {
		System.out.println("********Calculator*******");
		Cal c1 = new Cal();
		c1.welcome();
		c1.add();
		c1.sub(20, 10);
		System.out.println("Mul = " + c1.mul());
		System.out.println("Div = " + c1.div(100, 5));
	}
}
