import java.util.Scanner;

public class Student
{
	String name;
	int roll;
	int marks[] = new int[5];
	int sum, avg;
	Scanner sc = new Scanner(System.in);

	void accept()
	{
		System.out.println("enter the name ");
		name = sc.next();
		
		System.out.println("enter the roll");
		roll = sc.nextInt();
		for (int i = 0; i <marks.length; i++)
		{
			System.out.println("enter the mark" + (i + 1));
			marks[i] = sc.nextInt();
			
		}

	}

	void calculate()
	{
		for (int i = 0; i < marks.length; i++)
		{
			sum = sum + marks[i];
			avg = sum / marks.length;
			
		}

	}

	void result()
	{
		if (avg >= 60)
		{
			System.out.println("------------------------");
			System.out.println("congratulation you are pass");
			System.out.println("*******YOUR DETAILS ARE BELLOW**********");
			display();
		} 
		else
		{
			System.out.println("sorry you are failed!..pls work hard");
			System.out.println("*******YOUR DETAILS ARE BELLOW**********");
			display();
		}
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("roll no="+roll);
	
		System.out.println("your marks are:");

		for(int i=0;i<marks.length;i++)
		{
			
			System.out.println("subject "+(i+1)+"="+marks[i]);
			
		}
		System.out.println("your total marks you obtained is:"+sum +" out of 500");
		System.out.println("your avg marks is "+avg);
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String ch=null;
		do
		{
		Student s1=new Student();
		s1.accept();
		s1.calculate();
		s1.result();

		System.out.println("do you want insert another student details?(y/n)");
		}while("y".equalsIgnoreCase(sc.next()));
		System.out.println("Thanks!!!");
	}
}
