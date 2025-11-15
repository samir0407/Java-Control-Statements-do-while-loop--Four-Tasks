package ict22;

public class MainClass {
    public static void main(String[] args) {

        CustomPrintClass.pr("Sum Series = " + SumClass.sumSeries());

        CustomPrintClass.pr("GCD of 12 & 18 = " + DivisorMultipleClass.gcd(12, 18));
        CustomPrintClass.pr("LCM of 12 & 18 = " + DivisorMultipleClass.lcm(12, 18));

        CustomPrintClass.pr("15 in Binary: " + NumberConversionClass.decToBin(15));
        CustomPrintClass.pr("15 in Hex: " + NumberConversionClass.decToHex(15));
        CustomPrintClass.pr("15 in Octal: " + NumberConversionClass.decToOct(15));
    }
}
