package application;

import java.util.Arrays;

public class App {

	public static void main(String [] args) {
		String[] lapes = {"Poliarine lape", "Rudoji lape", "Dykumu lape"};
		Arrays.stream(lapes).forEach(lape -> {
			System.out.println(lape);
		});
	}
}
