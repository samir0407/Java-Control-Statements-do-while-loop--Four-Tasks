package ict22;

public class SumClass {
    public static double sumSeries() {
        double sum = 0.0;
        double num = 1.0;

        do {
            sum += num;
            num -= 0.1;
        } while (num >= 0.1);

        return sum;
    }
}
