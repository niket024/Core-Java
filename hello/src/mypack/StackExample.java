package mypack;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inpValue = "2 3 11 7 + 5 - 3 * + -";

		Stack<Integer> stack = new Stack<Integer>();
		Scanner expChar = new Scanner(inpValue);// creation of Scanner with given input String
		while (expChar.hasNext()) { // looping till scanner has data
			if (expChar.hasNextInt()) { // condition to check if the data is int type
				stack.push(expChar.nextInt());// push the int values to stack
			} else {
				int stackValue2 = stack.pop();// when data is not int type pop 2 int values
				int stackValue1 = stack.pop();
				String operator = expChar.next();

				if (operator.equals("+")) { // check type of operator
					stack.push(stackValue1 + stackValue2); // push the result evaluated
				} else if (operator.equals("-")) {
					stack.push(stackValue1 - stackValue2);
				} else {
					stack.push(stackValue1 * stackValue2);
				}

			}
		}
		expChar.close();
		int result = stack.pop(); // pop the final result

		System.out.println(result);

	}

}
