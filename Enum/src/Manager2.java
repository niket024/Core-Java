
public class Manager2
{
 enum E
 {
	 a,b,c,d;
 }
 public static void main(String[] args)
{
	E e1=E.b;
	System.out.println(e1);
	E e2=E.d;
	System.out.println(e2);
	System.out.println(e1.ordinal());
	System.out.println(e2.ordinal());
}
}
