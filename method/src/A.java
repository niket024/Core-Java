public class A {
	void sum() {
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("Sum = " + sum);
	}

	void diff(int num1, int num2) {
		int diff = num1 - num2;
		System.out.println("Difference = " + diff);
	}

	int mul() {
		int num1 = 10;
		int num2 = 20;
		int mul = num1 * num2;
		return mul;
	}

	int div(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.sum();
		a1.diff(20, 10);
		int result = a1.mul();
		int div = a1.div(100, 5);
		System.out.println("Mul = " + result);
		System.out.println("Div = " + div);
		System.out.println("main");
	}
}
