//Encapsulation

public class A {
	static int i = 10;
	int j = 20;

	public static void main(String[] args) {
		System.out.println(i);
		
		A a = new A();
		a.j = 30;
		i =80;
		System.out.println(a.j);
		System.out.println(i);
		
		A a1 = new A();
		System.out.println(a1.j);
		System.out.println(i);
	}
}
