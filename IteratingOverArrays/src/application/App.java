package application;

public class App {

	public static void main(String[] args) {
		String[] animals = { "dog", "cat", "sloth", "cow", "horse", "sheep" };
		animals[5] = ("dead parrot");
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}

}
