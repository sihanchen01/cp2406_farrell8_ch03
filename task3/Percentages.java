public class Percentages {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;
        System.out.println(getOutputMessage(a, b));
    }

    public static double computePercent(double a, double b) {
        return a / b;
    }

    public static String getOutputMessage (double a, double b) {
        return String.format("%s is %.2f percent of %s.\nAnd %s is %.2f percent of %s.",
                a, computePercent(a, b), b,
                b, computePercent(b, a), a);
    }
}
