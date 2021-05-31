package application;

public class Menu {
	
	String[] options = { "Add item", "View items", "Delete item", "Quit the program" };

	String get() {
		String menuText = "Choose an option:\n";

		for (int i = 0; i < options.length; i++) {
			menuText += String.format(" %d. %s\n", i, options[i]);			
		}		
		return menuText;
	}
}
