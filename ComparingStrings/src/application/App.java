package application;

public class App {

	public static void main(String[] args) {
		String text1 = "apple";
		String text2 = "apple";
		
		// I should never do this to  check if strings are identical:
		// System.out.println(text1 == text2);
		
		// This is proper way to do that:
		System.out.println("Strings are identical: " + text1.equals(text2));

	}

}
