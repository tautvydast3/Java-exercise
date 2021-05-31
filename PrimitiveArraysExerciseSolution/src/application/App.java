package application;

import java.util.Scanner;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		// Wait for user input
		Scanner scanner = new Scanner(System.in);
		// Create numbers array and set length
		int[] numbers = new int[3];
		/*
		 * Print "Enter the number", till all numbers inputed to array.
		 */
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Enter the number > ");
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
		/*
		 * Set range of numbers from array you want to print out
		 */
		System.out.printf("\nYou entered: ");
		IntStream.range(0, numbers.length).forEach(i -> {
			System.out.printf("\n" + numbers[i]);
		});
		/*
		 * Adding all numbers from array and spiting out sum *
		 */
		int arraySum = 0;
		for (int i = 0; i < numbers.length; i++) {
			arraySum = arraySum + numbers[i];
		}
		System.out.println("\nThese numbers sum is: \n" + arraySum);

	}

}