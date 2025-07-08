package DSA;

public class interest {
    public static void main(String[] args) {
        double interestRate = 0.05;
        double principal = 1000;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; year++) {
            double amount = principal * Math.pow(1.0 + interestRate, year);
            System.out.printf("%4d%20.2f%n", year, amount);
        }
    }
}
