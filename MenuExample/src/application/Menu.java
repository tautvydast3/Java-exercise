package application;

public class Menu {
	
	static String[] options = { "Add item", "View items", "Delete item", "Quit the program" };

	static void display() {
		System.out.println("Choose an option:");

		for (int i = 0; i < options.length; i++) {
			System.out.printf("\t%d. %s\n", i, options[i]);
		}
		
	}

}
