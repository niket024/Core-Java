import java.util.HashSet;
import java.util.Set;

public class FindingMaxAndMin {
	static int matRow = 3;
	static int matCol = 3;
	static int arr[][] = { { 1, 3, 4 }, { 5, 2, 9 }, { 8, 8, 6 } };

	public static void main(String[] args) {
		System.out.println(getCount());

	}

	private static int getCount() {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(count==-1) {
				return -1;
			}
			for (int j = 0; j < arr[i].length; j++) {
				boolean f = true;
				int num = arr[i][j];
				if (set.add(num)) {
					//System.out.print(num + "\t ");
					if (checkforMaximumInRow(num, i, j)) {
						if (f && count !=-1) {
							count++;
							f = false;
						}
					}
					if (checkforMaximumInCol(num, i, j)) {
						if (f && count !=-1) {
							count++;
							f = false;
						}
					}
					if (checkforMinimumInRow(num, i, j)) {
						if (f && count !=-1) {
							count++;
							f = false;
						}
					}
					if (checkforMinimumInCol(num, i, j)) {
						if (f && count !=-1) {
							count++;
							f = false;
						}
					}

				} else {
					count = -1;
					break;
				}
			}
		}
		return count;
	}

	private static boolean checkforMaximumInRow(int num, int row, int col) {
		boolean flag = false;
		for (int i = 0; i < matCol; i++) {
			if (i != col) {
				if (num > arr[row][i]) {
					flag = true;
					continue;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	private static boolean checkforMaximumInCol(int num, int row, int col) {
		boolean flag = false;
		for (int i = 0; i < matRow; i++) {
			if (i != row) {
				if (num > arr[i][col]) {
					flag = true;
					continue;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	private static boolean checkforMinimumInRow(int num, int row, int col) {
		boolean flag = false;

		for (int i = 0; i < matCol; i++) {
			if (i != col) {
				if (num < arr[row][i]) {
					flag = true;
					continue;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	private static boolean checkforMinimumInCol(int num, int row, int col) {
		boolean flag = false;

		for (int i = 0; i < matRow; i++) {
			if (i != row) {
				if (num < arr[i][col]) {
					flag = true;
					continue;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
