package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		final String USER_PASSWORD = "asad";
		boolean gotPassword = false;
		Scanner scanner = new Scanner(System.in);
		String password = "";

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter password > ");
			String input = scanner.nextLine();

			if (input.equals(USER_PASSWORD)) {
				gotPassword = true;
				break;
			}
		}
		scanner.close();

		if (gotPassword) {
			System.out.println("Access granted");
		} else {
			System.out.println("Access denied");
		}

	}

}
