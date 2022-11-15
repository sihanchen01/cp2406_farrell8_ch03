import javax.swing.*;

public class MetricConversion {
    public static final double INCH_TO_CM = 2.54;
    public static final double GALLON_TO_LITER = 3.7854;

    public static void main(String[] args) {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
        System.out.printf("%s inch(es) is equal to %.2f centimeters.\n%s gallon(s) is equal to %.2f liters.",
                userInput, getInchToCm(userInput), userInput, getGallonToLiter(userInput));
    }

    public static double getInchToCm (double x) {
        return x * INCH_TO_CM;
    }

    public static double getGallonToLiter (double x) {
        return x * GALLON_TO_LITER;
    }
}
