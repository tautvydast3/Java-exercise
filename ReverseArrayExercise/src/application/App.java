package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String reversed = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse > ");
		String userInput = scanner.next();

		// Turning String into char Array
		char[] chars = userInput.toCharArray();

		for (int j = 0; j < chars.length; j++) {
			
			System.out.println(chars[j]);
		}

		// Reverse Array and turn it back to String
		for (int i = chars.length - 1; i > -1; i--) {
			reversed += chars[i];
		}

		System.out.println(reversed);
	}

}
