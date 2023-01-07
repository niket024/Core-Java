import java.util.Objects;

public class B extends Object
{

	int i = 90;

	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B();
		B b3 = b2;
		System.out.println(b1 == b2);
		System.out.println(b2 == b3);
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));

	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		return i == other.i;
	}

	
}
