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
		System.out.println("START THE MACHINE! > ");
		String name = scanner.nextLine();
			

		if (name.equalsIgnoreCase("START")) {
			System.out.println("Machine starting ....");
		}
		
		if (name.equalsIgnoreCase("stop")) {
			System.out.println("Machine stopping .....");
		}
		
		System.out.printf("The lenght of '%s' is %d\n", name, name.length());

	}

}
