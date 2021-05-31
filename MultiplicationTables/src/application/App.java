package application;

import java.util.Arrays;

/*
 * Create a multiplication table, like this:
 * 
 * 1, 2, 3, 4 ...... 12
 * 2, 4, 6, 8 ...... 24
 * ....
 * ...
 * 
 * 12, 24, 36 ...... 144
 * 
 */

public class App {

	public static void main(String[] args) {
//		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
//		int[] multi = new int[numbers.length];
//
//		for (int i = 0; i < numbers.length; i++) {
//			int k = 0;
//			for (int j = 1; j < numbers.length + 1; j++) {
//				multi[k++] = j * numbers[i];
//			}
//
//			System.out.println(Arrays.toString(multi));
//		}
//
//	}

		// HOW IT WAS DONE IN TUTORIAL:

		int[][] table = new int[12][12];
		for (int i = 0; i < table.length; i++) {
			int[] row = table[i];
			for (int j = 0; j < row.length; j++) {
				row[j] = (i + 1) * (j + 1);
			}
		}
		for (int[] row : table) {
			for (int value : row) {
				System.out.printf("%4d", value);
			}
			System.out.println();
		}
	}
}
