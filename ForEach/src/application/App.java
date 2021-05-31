package application;
import java.util.Scanner;
import java.util.stream.IntStream;
public class App {

	public static void main(String[] args) {
		String zodziai[] = new String[3];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Iveskite zodi > ");
			String zodis = scanner.nextLine();
			for (;;) {
				zodziai[i] = zodis;
				break;
			}
		}
		scanner.close();

		System.out.printf("\nJus ivedete: ");
		// Budas atspausdinti string array FOR EACH
		for (String zodis : zodziai) {
			System.out.println(zodis);
		}
	}
}
