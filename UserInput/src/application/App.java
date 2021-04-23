
package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// FAHRENHEIT TO CELSIUS CONVERTER WITH USER INPUT
		/*
		 * Scanner scanner = new Scanner (System.in);
		 * 
		 * System.out.print("Enter value in Fahrenheit to convert > ");
		 * 
		 * double fahrenheit = scanner.nextFloat(); double celsius = (fahrenheit - 32) *
		 * 5.0 / 9.0;
		 * 
		 * System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius.",
		 * fahrenheit, celsius);
		 */

		// Nautical miles to kilometers converter with user input

		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter value in nautical miles to convert > "); 
		
		double nauticalMiles = scanner.nextFloat();
		scanner.close();
		double kilometres = nauticalMiles * 1.852;

		System.out.printf("%.2f nautical miles is equal to %.2f kilometres.", nauticalMiles, kilometres);

	} 
}