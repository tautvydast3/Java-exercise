package application;

public class Hangman {
    private boolean running = false;
    private RandomWord word = new RandomWord();

    public void run() {

        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    private void getUserInput(){
        System.out.println("getUserInput");
    }
    private void checkUserInput(){
        System.out.println("checkUserInput");
    }
    private void displayWord(){
        System.out.println(word);
    }
}
