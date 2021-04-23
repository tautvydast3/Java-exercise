package application;

public class App {

	public static void main(String[] args) {
		int otters = 5;
		int giraffes = 10;
		int elephants = 3;
		
		int animals = --elephants + ++otters + giraffes++ + elephants;

		System.out.printf("Otters: %d\n", otters);
		System.out.printf("Giraffes: %d\n", giraffes);
		System.out.printf("Elephants: %d\n", elephants);
		System.out.printf("Animals : %d\n", animals);

	}

}
