import javax.swing.*;

public class NumbersDemo2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
        NumbersDemo.displayTwiceTheNumber(a);
        NumbersDemo.displayTwiceTheNumber(b);
        NumbersDemo.displayNumberPlusFive(a);
        NumbersDemo.displayNumberPlusFive(b);
        NumbersDemo.displayNumberSquared(a);
        NumbersDemo.displayNumberSquared(b);
    }

}
