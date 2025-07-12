package DSA;

import java.util.Scanner;

public class sumOfDigits {
    public static int calculationSumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an four digit integer: ");
        int number = input.nextInt();

        int sum = calculationSumDigits(number);
        System.out.printf("The sum of the digits in %d is %d%n", number, sum);

    }

}
