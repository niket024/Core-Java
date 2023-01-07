import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException {

		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student name");
		String name = sc.next();
		FileWriter fileWriter = new FileWriter(name+"_result.txt");

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks " + (i + 1));
			marks[i] = sc.nextInt();
		}
		System.out.println("Marks are :");
		fileWriter.write("Marks are :\n");
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
			System.out.println(marks[i]);
			fileWriter.write(marks[i] + "\n");

		}
		System.out.println("Total marks = " + sum);
		fileWriter.write("Total marks = " + sum);
		int avg = sum / 5;
		System.out.println("Average mark = " + avg);
		fileWriter.write("\n Average mark = " + avg);

		if (avg >= 60) {
			System.out.println("Congratulations!!! your passed");
			fileWriter.write("\n Congratulations!!! your passed");

		} else {
			System.out.println("OOPS!! your failed");
			fileWriter.write("\n OOPS!! your failed");

		}
		fileWriter.flush();
		fileWriter.close();
	}
}
