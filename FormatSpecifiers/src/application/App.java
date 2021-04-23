package application;

public class App {

	public static void main(String[] args) {

		// CELSIUS TO FAHRENHEIT CONVERTER

		/*
		 * double celsius = 15.0; double fahrenheit = (celsius * 1.8) + 32;
		 * 
		 * System.out.println(celsius + " degrees Celsius is " + fahrenheit +
		 * " degrees Fahrenheit.");
		 */

		// FAHRENHEIT TO CELSIUS CONVERTER

		double fahrenheit = 91.0;
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;

		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
		System.out.printf(fahrenheit + " degrees Fahrenheit is %.1f %S", celsius, "degrees Celsius.");

	}

}
