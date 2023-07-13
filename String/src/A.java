public class A {

	int i;

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 ="abc";
		System.out.println(s1==s2);
		String s3 = new String("abc");
		String s4 = "abc";
		System.out.println(s1==s3);
		
		System.out.println(s2==s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String s5 = "xyz";
		System.out.println(s1.equals(s5));
	
	}

}
