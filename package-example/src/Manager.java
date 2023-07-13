import java.lang.*;
import java.util.Scanner;
public class Manager {
	public static void main(String[] args) {
		System.out.println("main");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int a = sc.nextInt();
		System.out.println("Enter the number 2");
		int b = sc.nextInt();
		System.out.println("Sum = "+ (a+b));
	}

}