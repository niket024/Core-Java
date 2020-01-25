package com.ellucian.interview.assignments.helper;

public class ExecutionTimeHelper {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		printExecutionTime(startTime, endTime);
	}

	public static void printExecutionTime(long startTime, long endTime) {
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in milliseconds: " + timeElapsed);
	}
}
