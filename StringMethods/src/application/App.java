package application;

public class App {

	public static void main(String[] args) {
		String name = "Vetra";

		if (name.equals("Vetra")) {
			System.out.println("1. Suniuko vardas yra Vetra.");
		}

		if (name.equalsIgnoreCase("VETRA")) {
			System.out.println("2. Suniuko vardas yra Vetra.");
		}
		System.out.printf("The lenght of '%s' is %d\n", name, name.length());

	}

}
