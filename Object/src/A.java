import java.util.Objects;

public class A {

	int i = 90;
	int j = 20;
	int k = 30;

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = a2;
		System.out.println(a1 == a2);
		System.out.println(a2 == a3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
	
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + ", k=" + k + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return i == other.i && j == other.j && k == other.k;
	}
	
	

}
