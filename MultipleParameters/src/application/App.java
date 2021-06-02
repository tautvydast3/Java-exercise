package application;

public class App {

	public static void main(String[] args) {
		final int toSquare = 11;
		Calculator calc = new Calculator();
		
		int squared = calc.square(toSquare);
		System.out.printf("%d squared is %d\n", toSquare, squared);
		
		int added = calc.add(7, 5);
		System.out.println("7 plus 5 is " + added);
		
		int subtracted = calc.sub(7, 5);
		System.out.println("7 minus 5 is " + subtracted);
		
		int multiplicated = calc.multi(7, 5);
		System.out.println("7 multiplicated by 5 is " + multiplicated);
		
		int divided = calc.div(7, 5);
		System.out.println("7 divided by 5 is " + divided);

	}

}
