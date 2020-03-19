package com.nik.problems;

import java.util.Scanner;

public class SpiralMatrixDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int spiral[][] = getSpiralMatrix(n);
		for (int i = 0; i < spiral.length; i++) {
			for (int j = 0; j < spiral.length; j++) {
				System.out.print(spiral[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

	private static int[][] getSpiralMatrix(int n) {
		int spiralMatrix[][] = new int[n][n];
		int r = 0, c = 0;
		int lastRow = n - 1, lastCol = n - 1;
		int value = 0;
		int i;
		while (c <= lastCol && r <= lastRow) {
			for (i = c; i <= lastCol; i++) {
				spiralMatrix[r][i] = ++value;
			}
			r++;
			for (i = r; i <= lastRow; i++) {
				spiralMatrix[i][lastCol] = ++value;
			}
			lastCol--;
			for (i = lastCol; i >= c; i--) {
				spiralMatrix[lastRow][i] = ++value;
			}
			lastRow--;
			for (i = lastRow; i >= r; i--) {
				spiralMatrix[i][c] = ++value;
			}
			c++;

		}
		return spiralMatrix;
	}
}
