public class A extends Object {
	int i = 90;
	int j = 80;
	int k = 10;

	public static void main(String[] args) {
		A a1 = new A();

		System.out.println(a1.toString());

	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + ", k=" + k + "]";
	}

	

}
