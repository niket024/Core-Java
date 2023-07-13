import java.util.Scanner;

public class A {
	public static void main(String args[]) {
		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks of subject " + (i + 1));
			marks[i] = sc.nextInt();
		}
		System.out.println("Your marks are:");
		int totalMarks = 0;

		for (int i = 0; i < marks.length; i++) {
			totalMarks = totalMarks + marks[i];
			System.out.println("Sunject " + (i + 1) + ":" + marks[i]);
		}
		System.out.println("Total marks = " + totalMarks);
		int avg = totalMarks / marks.length;
		System.out.println("Avg = " + avg);
		if (avg >= 50) {
			System.out.println("COngratulations!! you  are pass");
		} else {
			System.out.println("Ooops!! you are failed");
		}
	}
}
