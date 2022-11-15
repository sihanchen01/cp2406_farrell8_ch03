public class NumbersDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }

    public static void displayTwiceTheNumber(int i) {
        System.out.println(i * 2);
    }

    public static void displayNumberPlusFive(int i) {
        System.out.println(i + 5);
    }
    public static void displayNumberSquared(int i) {
        System.out.println(i * i);
    }
}
