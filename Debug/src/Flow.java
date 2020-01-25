
public class Flow
{
public static void main(String[] args)
{
	test1(89);
	System.out.println("main");
	test3();
}
static void test1(int i)
{
	System.out.println("test1");
	System.out.println(i);
	test2();
}
static void test2()
{
	System.out.println("test1");
	test3();
}
static void test3()
{
	System.out.println("test1");

}
}
