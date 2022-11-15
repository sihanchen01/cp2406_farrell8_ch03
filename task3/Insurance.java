import javax.swing.*;

public class Insurance {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        int premium = getPremium(age);
        JOptionPane.showMessageDialog(null, String.format(
                "You are %s years old, the premium for you is $%s.",
                age, premium
        ));

    }

    public static int getPremium (int age) {
        return ((age / 10) + 15) * 20;
    }
}
