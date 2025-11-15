package ict22;

public class NumberConversionClass {

    public static String decToBin(int n) {
        return Integer.toBinaryString(n);
    }

    public static String decToHex(int n) {
        return Integer.toHexString(n);
    }

    public static String decToOct(int n) {
        return Integer.toOctalString(n);
    }
}
