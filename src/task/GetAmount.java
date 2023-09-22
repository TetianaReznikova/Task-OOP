package task;

import java.util.Locale;
import java.util.Scanner;

public class GetAmount {
    double getSum() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Enter sum: ");
        double amount = sc.nextDouble();
        sc.close();
        return amount;
    }
}
