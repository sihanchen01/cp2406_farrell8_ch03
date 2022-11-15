import javax.swing.*;

public class CraftPricing {
    public static void main(String[] args) {
        JTextField nameField = new JTextField();
        JTextField costField = new JTextField();
        JTextField hoursOfWorkField = new JTextField();

        Object [] fields = {
                "Name of product: ", nameField,
                "Cost of material: ", costField,
                "Hours of work required: ", hoursOfWorkField
        };


        int result = JOptionPane.showConfirmDialog(null, fields,
                "Craft Price Calculator", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            double cost = Double.parseDouble(costField.getText());
            double hoursOfWork = Double.parseDouble(hoursOfWorkField.getText());
            double finalPrice = getFinalPrice(cost, hoursOfWork);
            JOptionPane.showMessageDialog(null, String.format(
                    "The price for a %s with the material cost of $%.2f, and %.2f working hours required is: $%.2f.",
                    nameField.getText(), cost, hoursOfWork, finalPrice
            ));
        }
    }

    public static double getFinalPrice(double costOfMaterial, double hours) {
        return (costOfMaterial + 12) * hours + 7;
    }
}
