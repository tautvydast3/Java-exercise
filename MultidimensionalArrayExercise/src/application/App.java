package application;

public class App {

	public static void main(String[] args) {

		/*
		 * Exercise
		 * 
		 * Create a multidimensional array of int. Make it 3x3 Loop through it and
		 * output all the values on the diagonal, from top left to bottom right. Add up
		 * these values and print the total.
		 */

		// Pastaba
		// visiskai nesupratau kaip reikejo ishspresti uzduoti
		// Reikejo padaryti matrica 3x3, pvz:
		// { { 1, 2, 3 },
		// { 4, 5, 6 },
		// { 7, 8, 9 } };
		//
		// tada atspausdinti 1, 5, 9 ir juos sudeti.

		// Taip kaip pavyzdyje:

		int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		int total = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println(values[i][i]);
			total += values[i][i];

			// My solution with integers

//		int[][] three = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		String space = "";
//
//		for (int i = 0; i < three.length; i++) {
//			for (int j = 0; j < three[i].length; j++) {
//				String three1 = space + three[i][j];
//				System.out.println(three1);
//				space += "\t ";
//			}

			// My solution with Strings

//		String[][] three = { { "one", "two", "three" }, { "four", "five", "six" }, { "seven", "eight", "nine" } };
//		String space = "";
//
//		for (int i = 0; i < three.length; i++) {
//			for (int j = 0; j < three[i].length; j++) {
//				String three1 = space + three[i][j];
//				System.out.println(three1);
//				space += "\t ";
//			}
//
//		}

		}
	}
}
