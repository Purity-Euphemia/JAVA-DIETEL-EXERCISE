package DSA;

import java.util.Scanner;

public class modifiedDiamondPrintingOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;

        while (true) {
            System.out.println("Enter the odd number between 1 and 19: ");
            rows = scanner.nextInt();

            if (rows >= 1 && rows <= 19 && rows % 2 != 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an odd number between 1 and 19.");
            }
        }

        int mid = rows / 2 + 1;

        for (int row = 1; row <= mid; row++) {
            for (int space = 1; space <= mid - row; space++) {
                System.out.print("  ");
            }
        for (int count = 1; count <= 2 * row - 1; count++) {
            System.out.print("* ");
        }
        System.out.println();
        }

        for (int row = mid - 1; row >= 1; row--) {
            for (int space = 1; space <= mid - row; space++) {
                System.out.print("  ");
            }
        for (int count = 1; count <= 2 * row - 1; count++) {
            System.out.print("* ");
        }
        System.out.println();
        }

    }
}
