package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int[] numbers = new int[3];

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number > ");
		numbers[0] = scanner.nextInt();
		System.out.print("Enter second number > ");
		numbers[1] = scanner.nextInt();
		System.out.print("Enter third number > ");
		numbers[2] = scanner.nextInt();
		
		scanner.close();

		for (int i = 0; i < 3; i++) {
			System.out.println(numbers[i]);
		}
		int sum = numbers[0] + numbers[1] + numbers[2];
		System.out.print("Sum of  these three numbers is: " + sum);
	}

}
