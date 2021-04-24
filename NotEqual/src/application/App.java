package application;

public class App {

	public static void main(String[] args) {
		// != "not equals" binary operator

		int value4 = 4;
		int value5 = 5;

		if (value4 != value5) {
			System.out.println("Values are not equal");
		}

		System.out.println(value4 != value5);
		System.out.println(value4 = value5);

		String fruit1 = "orange";
		String fruit2 = "apple";

		if (!fruit1.equals(fruit2)) {
			System.out.println("fruits are not the same");
		}

		if (fruit1.equals(fruit2) != true) {
			System.out.println("fruits are not the same");
		}

		System.out.println(fruit1.equals(fruit2));
		System.out.println(fruit1.equals(fruit2) == false);
		System.out.println(fruit1.equals(fruit2) != true);

	}

}
