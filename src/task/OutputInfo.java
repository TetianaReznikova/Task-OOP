package task;

public class OutputInfo {
    public static void dataOnScreen(double sum, double discountSum, double total) {
        System.out.println("Total cost: " + sum);
        System.out.println("Your discount is: " + discountSum);
        System.out.println("You have to pay: " + total);
    }
}
