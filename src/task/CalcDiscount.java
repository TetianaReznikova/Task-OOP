package task;

public class CalcDiscount {
    private static double discount(double sum) {
        if (sum <= 5000) {
            return sum * 0.05;
        } else if (sum <= 10000) {
            return sum * 0.1;
        } else {
            return sum * 0.15;
        }
    }
}
