package task;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Rounder {
    public static double roundSum(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
