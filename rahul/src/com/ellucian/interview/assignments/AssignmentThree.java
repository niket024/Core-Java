package com.ellucian.interview.assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.ellucian.interview.assignments.helper.ExecutionTimeHelper;

public class AssignmentThree {
	
	public AssignmentThree() {
		execute();
	}

	private static void execute() {
		List<String> inputData = new LinkedList<>();
		inputData.add("2");
		inputData.add("1");
		inputData.add("+");
		inputData.add("3");
		inputData.add("*");
		inputData.add("15");
		inputData.add("+");
		calculateUsingStackApproach(inputData);
	}
	
	public static void main(String[] args) {
		execute();
	}

	/**
	 * We can loop through each element in the given string list. if it is a number,
	 * push it to the stack. if it is an operator, pop two numbers from the stack,
	 * do the calculation, and push back the result to stack.
	 **/

	public static void calculateUsingStackApproach(List<String> inputData) {
		long startTime = System.currentTimeMillis();
		String operators = "+-*/";

		Stack<String> resultContainer = new Stack<String>();

		for (String ele : inputData) {
			if (!operators.contains(ele)) {
				// push to stack if it is a number
				resultContainer.push(ele);
			} else {
				// pop numbers from stack if it is an operator
				int a = Integer.valueOf(resultContainer.pop());
				int b = Integer.valueOf(resultContainer.pop());
				switch (ele) {
				case "+":
					resultContainer.push(String.valueOf(a + b));
					break;
				case "-":
					resultContainer.push(String.valueOf(b - a));
					break;
				case "*":
					resultContainer.push(String.valueOf(a * b));
					break;
				case "/":
					resultContainer.push(String.valueOf(b / a));
					break;
				}
			}
		}
		System.out.println(Integer.valueOf(resultContainer.pop()));
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}

	public static void rtn(List<String> inputData) {
		long startTime = System.currentTimeMillis();
		Stack<String> resultContainer = new Stack<String>();
		String operators = "+-*/";
		for (String ele : inputData) {
			if (!operators.contains(ele)) {
				// push to stack if it is a number
				resultContainer.push(ele);
			} else {
				// pop numbers from stack if it is an operator

				int a = Integer.valueOf(resultContainer.pop());
				int b = Integer.valueOf(resultContainer.pop());
				if (ele.equals("+"))
					resultContainer.push(String.valueOf(a + b));
				else if (ele.equals("-"))
					resultContainer.push(String.valueOf(b - a));
				else if (ele.equals("*"))
					resultContainer.push(String.valueOf(a * b));
				else if (ele.equals("/"))
					resultContainer.push(String.valueOf(b / a));
			}

			System.out.println(Integer.valueOf(resultContainer.pop()));
		}
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}
}
