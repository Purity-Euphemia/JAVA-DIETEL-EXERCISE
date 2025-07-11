package DSA;

import java.util.Scanner;

public class maximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating point values separated by spaces:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result =  maximum(number1, number2, number3);

        System.out.println("The maximum is " + result);
    }

    public static double maximum(double num1, double num2, double num3) {
        double max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
