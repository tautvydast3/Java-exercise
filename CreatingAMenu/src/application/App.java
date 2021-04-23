package application;

public class App {

	public static void main(String[] args) {
		
		/*
		 * String editing exercise.
		 * 
		 *	Select an option:
		 *		1. Add an entry
		 *		2. View the database
		 *		3. Exit
		 */
		
		/*
		 * This is my version of solving this:
		 * 
		String firstLine = "Select an option:";
		String secondLine = "Add an entry";
		String thirdLine = "View the database";
		String fourthLine = "Exit";
		
		String newLine = "\n";
		String tab = "\t";
		String doubleTab = "\t\t";		
		String dot = ". ";
		
		int first = 1;
		int second = 2;
		int third = 3;
		
		System.out.println(tab + firstLine + newLine + doubleTab + first + dot + 
				secondLine + newLine + doubleTab + second + dot +
				thirdLine + newLine + doubleTab + third + dot + fourthLine);
		*/
		
		// This is Udemy course version:
		
		String prompt = "Select an option:";
		String option1 = "Add an entry";
		String option2 = "View the database";
		String option3 = "Exit";
		
		int value1 = 1;
		int value2 = 2;
		int value3 = 3;
		
		String menu = "\t" + prompt + "\n";
		menu += "\t\t" + value1 + ". " + option1 + "\n";
		menu += "\t\t" + value2 + ". " + option2 + "\n";
		menu += "\t\t" + value3 + ". " + option3;
		
		System.out.println(menu);
	}

}
