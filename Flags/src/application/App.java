package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean gotCodeWord = false;

		for (;;) {
			System.out.println(" > ");
			String input = scanner.nextLine();

			if (input.equals("quit")) {
				break;
			} else if (input.equals("volcano")) {
				gotCodeWord = true;
			}
		}
		scanner.close();

		if (gotCodeWord) {
			System.out.println("Codeword entered.");
		} else {
			System.out.println("No codeword detected.");
		}
	}

}
