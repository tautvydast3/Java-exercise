package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		final String USER_PASSWORD = "tele";
		int count = 0;

		System.out.print("Input password > ");
		Scanner scanner = new Scanner(System.in);
		String inputPass = scanner.nextLine();

		while (count < 3) {
			if (inputPass.equals(USER_PASSWORD)) {
				System.out.println("Password is correct!");
				break;
			} else {
				System.out.println("Try again > ");
				inputPass = scanner.nextLine();
			}
			count++;
		}
		scanner.close();

		// How it was done in the tutorial:

		/*
		 * final String USER_PASSWORD = "hello";
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * while(true) { System.out.print("Enter password > "); String password =
		 * scanner.nextLine();
		 * 
		 * if(password.equals(USER_PASSWORD)){ System.out.println("Access granted.");
		 * break; } else{ System.out.println("Access denied."); } } scanner.close();
		 */
	}
}
