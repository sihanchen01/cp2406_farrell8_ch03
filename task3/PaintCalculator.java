import javax.swing.*;

public class PaintCalculator {
    public static final int WALL_AREA_FOR_ONE_GALLON = 350;
    public static final int PRICE_FOR_ONE_GALLON = 32;

    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter room's length (ft): "));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter room's width (ft): "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter room's height (ft): "));
        double wallArea = getWallArea(length, width, height);
        double paintNeeded = getPaintNeeded(wallArea);
        System.out.printf("You need %.2f gallons of paint.", paintNeeded);
        double budget = getBudget(paintNeeded);
        System.out.printf("To paint a %.2f-by-%.2f-foot room with %.2f-foot ceiling, you need $%.2f.",
                length, width, height, budget);
    }

    public static double getWallArea (double l, double w, double h) {
        return 2 * h * (l + w);
    }

    public static double getPaintNeeded (double wallArea) {
        return wallArea / WALL_AREA_FOR_ONE_GALLON;
    }

    public static double getBudget (double gallon) {
        return gallon * PRICE_FOR_ONE_GALLON;
    }
}
