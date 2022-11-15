import javax.swing.*;

public class BookstoreCredit {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter student's name: ");
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter student's gpa: "));
        System.out.printf("Student %s with %.2f GPA is rewarded with $%.2f credits.",
                name, gpa, calculateCredit(gpa));
    }

    public static double calculateCredit (double gpa) {
        return gpa * 10;
    }
}
