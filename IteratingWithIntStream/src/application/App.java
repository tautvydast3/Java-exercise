package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		String[] animals = { "dog", "cat", "sloth", "cow", "horse", "sheep" };

		IntStream.range(0, animals.length).forEach(i -> {
			System.out.printf("%d. %s\n", i, animals[i]);
		});
	}

}
