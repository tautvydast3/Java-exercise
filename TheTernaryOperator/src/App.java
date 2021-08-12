public class App {
    public static void main(String[] args) {
        System.out.println(false ? "yes" : "no");
//
        int value = 88;
        value = value > 60 ? 60 : value;
        System.out.println(value);
        System.out.println();
//
        int[] values = {6, 3, 92, 63, 14, 114};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int currentValue: values) {
            min = currentValue < min ? currentValue: min;
            max = currentValue > max ? currentValue: max;{
            }
        }
            System.out.println(min + "\n" + max);
//
    }
}
