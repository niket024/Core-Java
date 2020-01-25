package real;

public class Employee extends Object
{
	private int id;
	private String fName;
	private String lName;
	private int age;

	public Employee(int id, String fName, String lName, int age)
	{
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", age=" + age + "]";
	}
	
	
}
