package example;

public class Employee implements Comparable

{
	Integer id;
	String name;
	Integer age;

	public Employee()
	{

	}

	Employee(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	@Override
	public int compareTo(Object o)
	{
		Employee e = (Employee) o;
		if (this.id > e.id)
		{
			return 1;
		} else if (this.id < e.id)
		{
			return -1;
		} else
		{
			return 0;
		}

	}

	@Override
	public String toString()
	{

		return this.id + " " + this.name + "" + this.age;
	}

}
