package DSA;

public class tableOfBinaryOctalAndHexadecimalNumbers {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10%-10s%-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        for (int counter = 1; counter <= 256; counter++) {
            String binary = Integer.toBinaryString(counter);
            String octal = Integer.toOctalString(counter);
            String hexadecimal = Integer.toHexString(counter).toUpperCase();
            System.out.printf("%-10d%-10s%-10s%-10s%n", counter, binary, octal, hexadecimal);
        }
    }
}
