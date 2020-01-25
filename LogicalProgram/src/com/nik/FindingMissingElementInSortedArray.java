package com.nik;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class FindingMissingElementInSortedArray
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18 };

		printMissingNumber1(arr);
		printMissingNumber(arr);
	}

	private static void printMissingNumber1(int[] arr) {
		Arrays.sort(arr);//if unordered
		int num =1;
		for(int i = 0; i<arr.length;i++) {
			if(num!=arr[i]) {
				System.out.println("Missing no = "+(i + 1));
				break;
			}
			num++;
		}
		
	}

	private static void printMissingNumber(int[] arr)
	{
		int n = arr[arr.length - 1];
		int Expectedsum = n * (n + 1) / 2;
		int actualSum = IntStream.of(arr).sum();
		System.out.println("Missing no = " + (Expectedsum - actualSum));
	}
}
