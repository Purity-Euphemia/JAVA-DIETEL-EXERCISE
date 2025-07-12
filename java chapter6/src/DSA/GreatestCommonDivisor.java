package DSA;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int result = gcd(number1, number2);
        System.out.printf("The GCD of %d and %d is %d%n", number1, number2, result);
     }
    }

