package application;

public class App {

	public static void main(String[] args) {

		/*
		 * 0. Potatoes 1. Rice 2. Pasta 3. Bread
		 */

		String[] foods = { "Potatoes", "Rice", "Pasta", "Bread" };
		
		foods[1] = "Tomatoes";
		
		System.out.println(foods[2]);
		System.out.println(foods[1]);
		System.out.println(foods[3]);
	}

}
