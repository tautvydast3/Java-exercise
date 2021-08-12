package application;

public class App {
    public static void main(String[] args) {
        String text = "I ";
        text += "am ";
        text += "a Giraffe";

        System.out.println(text);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("I ");
        sb1.append("am ");
        sb1.append("a ");
        sb1.append("Herring ");

        String result1 = sb1.toString();
        System.out.println(result1);


        StringBuilder sb2 = new StringBuilder("I ");
        sb2.append("am ").append("a ").append("Ferret");
        String result2 = sb2.toString();
        System.out.println(result2);

        String animal = "Otter";
        StringBuilder sb3 = new StringBuilder("I ");
        sb3.append("am ").append("a ").append(animal);
        String result3 = sb3.toString();
        System.out.println(result3);
    }
}
