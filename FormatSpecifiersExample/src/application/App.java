package application;

public class App {

	public static void main(String[] args) {
		 
		// FAHRENHEIT TO CELSIUS CONVERTER

		double fahrenheit = 91.0;
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;

		System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius.", fahrenheit, celsius);

	}

}
