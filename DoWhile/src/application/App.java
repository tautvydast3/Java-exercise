package application;

public class App {

	public static void main(String[] args) {

		/*
		 * boolean loopCondition = true; do { System.out.println("Yeah, whatever"); }
		 * while (loopCondition);
		 */
		// When counting this way, it counts till 10:
		int count = 0;
		int count1 = 0;

		do {
			System.out.println("This one counts to ten " + count);

		} while (count++ < 10);

		System.out.println("");

		do {
			System.out.println("This one counts to nine " + count1);
			count1++;
		} while (count1 < 10);

	}

}
