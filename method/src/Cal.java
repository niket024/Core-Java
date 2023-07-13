public class Cal {

	void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}

	void sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Sub = " + sub);
	}

	int mul() {
		int n1 = 20;
		int n2 = 40;
		int mul = n1 * n2;
		return mul;
	}

	int div(int d1, int d2) {
		return d1 / d2;
	}


	public static void main(String[] args) {
		System.out.println("**********Calculator**************");
		Cal cal = new Cal();
		cal.add();
		cal.sub(20, 10);
		int result = cal.mul();
		System.out.println("Mul = " + result);
		int div = cal.div(100, 5);
		System.out.println("Div = " + div);
		cal.getTriangleArea();
	}
}
