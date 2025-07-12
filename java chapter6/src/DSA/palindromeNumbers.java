package DSA;

import java.util.Scanner;

public class palindromeNumbers {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse == original;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.printf("%d is a palindrome%n", number);

        } else {
            System.out.printf("%d is not a palindrome%n", number);
        }
    }

}
