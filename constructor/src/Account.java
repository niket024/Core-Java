public class Account
{
	int accNo;
	int balance;
	String name;
	int age;

	public Account(int accNo, int balance, String name, int age)
	{
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args)
	{
		Account customer1 = new Account(123, 5000, "Adarsh", 21);
		System.out.println("Customer1 Details:");
		System.out.println(customer1.accNo);
		System.out.println(customer1.balance);
		System.out.println(customer1.name);
		System.out.println(customer1.age);
		System.out.println("------------------------");
		Account customer2 = new Account(222, 50000, "Manasa", 18);
		System.out.println("Customer2 Details:");
		System.out.println(customer2.accNo);
		System.out.println(customer2.balance);
		System.out.println(customer2.name);
		System.out.println(customer2.age);
	}
}
