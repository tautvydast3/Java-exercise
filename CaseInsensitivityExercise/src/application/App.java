package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * 
		 * Create a program that asks the user to enter a command.
		 * 
		 * If they enter 'start' or 'START', regardless of capitalisation, print
		 * 'Machine starting ....'
		 * 
		 * If they Enter 'stop', regardless of capitalisation, print 'Machine stopping
		 * .....'.
		 * 
		 * If they enter 'quit', print 'Exiting' ....' and quit the program.
		 * 
		 * Otherwise print 'Unrecognised command'.
		 * 
		 * Ask them to enter a command repeatedly until they stop the program by
		 * entering 'quit'.
		 * 
		 * Hints:
		 * 
		 * Use the string length to determine if they have entered nothing.
		 * 
		 * To check user input, either use "if" or else use a switch and transform the
		 * user input to upper case.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
				
			System.out.println("\t\t\t\t   Commands:");
			System.out.println("");
			System.out.println("\t\t\t        START / STOP");
			System.out.println("\t\t\t\t     quit");
			System.out.println("");


		for (;;) {
			System.out.println("\t\t\t     Enter the command > ");
			String command = scanner.nextLine();

			if (command.equals("quit")) {
				System.out.println("Exiting .....");
				break;
			}

			// If they enter 'start' or 'START', regardless of capitalisation, print
			// 'Machine starting ....'

			else if (command.equalsIgnoreCase("START")) {
				System.out.println("Machine starting ....");
			}

			// If they Enter 'stop', regardless of capitalisation, print 'Machine stopping
			// .....'.

			else if (command.equalsIgnoreCase("stop")) {
				System.out.println("Machine stopping .....");
			}

			// Otherwise print 'Unrecognised command'.

			else if (!command.equals("")) {
				System.out.println("Unrecognised command");
			}

			// Use the string length to determine if they have entered nothing.

			else if (command.length() == 0) {
				System.out.println("Unrecognised command");
			}
		}
	}
}
