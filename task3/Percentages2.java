import javax.swing.*;

public class Percentages2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        System.out.println(Percentages.getOutputMessage(a, b));
    }
}
