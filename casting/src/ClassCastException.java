import java.util.Objects;

class A {

}

class B extends A {

}

public class ClassCastException {
	
	int i;
	public static void main(String[] args) {
		A a1 = new B();
		
		B b1 = (B) new A();
		System.out.println("done");
	}
	
	
}
