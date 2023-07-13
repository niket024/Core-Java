
public class Customer {
	int id;
	String accNo;
	String name;
	int age;
	double balance;
	static String bankName = "SBI";

	public Customer() {
		System.out.println("Customer created");
	}
	

	public Customer(int id, String accNo, String name, int age, double balance) {
		
		this.id = id;
		this.accNo = accNo;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}


	public static void main(String[] args) {
		Customer customer1 = new Customer(123, "1234", "Ram", 30, 500.0);
		

		Customer customer2 = new Customer(124, "12345", "Sita", 25, 5000.0);
		
		Customer customer3 = new Customer();

		System.out.println("*******Customer1 details**************");
		System.out.println("ID = " + customer1.id);
		System.out.println("Name = " + customer1.name);
		System.out.println(customer1.accNo);
		System.out.println(customer1.balance);
		System.out.println(customer1.age);
		System.out.println(customer1.bankName);

		System.out.println("*******Customer2 details**************");

		System.out.println("ID = " + customer2.id);
		System.out.println("Name = " + customer2.name);
		System.out.println(customer2.accNo);
		System.out.println(customer2.balance);
		System.out.println(customer2.age);
		System.out.println(customer2.bankName);
		
		System.out.println("*******Customer3 details**************");

		System.out.println("ID = " + customer3.id);
		System.out.println("Name = " + customer3.name);
		System.out.println(customer3.accNo);
		System.out.println(customer3.balance);
		System.out.println(customer3.age);
		System.out.println(customer3.bankName);
	}
}
