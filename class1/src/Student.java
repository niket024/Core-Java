public class Student
{
	int id;
	String name;

	Student(int i, String n)
	{
		id = i;
		name = n;

	}

	void display()
	{
		System.out.println(id + "is number" + name);

	}

	public static void main(String[] args)
	{
		Student S1 = new Student(111, "Kiren");
		Student S2 = new Student(112, "Ashan Amsudhan");
		S1.display();
		S2.display();

	}
}
