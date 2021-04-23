package application;

public class App {

	public static void main(String[] args) {
		boolean isRaining = false;
		if (isRaining)
			System.out.println("It's raining!");
		
		// Notice that folowing line has nothing to do with statement above
		// and will be executed no matter what boolean value is.
		System.out.println("Take an umbrella.");

	}

}
