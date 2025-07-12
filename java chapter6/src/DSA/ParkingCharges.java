package DSA;

import java.util.Scanner;

public class ParkingCharges {
    public static double calculateParkingCharges(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            double extraHours = Math.ceil(hours - 3);
            charge += extraHours * 0.5;

        }
        if (hours > 10.0) {
            charge = 10.0;

        }
        return charge;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        int customerNumber = 1;

        while (true) {
            System.out.print("Enter the number of hours for customer " + customerNumber + " (or -1 to quit): ");
            double hours = input.nextDouble();

            if (hours == -1) {
                break;
            }
            if (hours <= 0 || hours > 24) {
                System.out.println("Invalid input");
                continue;
            }

            double charge = calculateParkingCharges(hours);
            System.out.printf("Customer %d, the total receipt is $%.2f%n", customerNumber, charge);
            totalReceipts += charge;
            customerNumber++;
        }
        System.out.printf("The total receipts for the customers is $%.2f%n", totalReceipts);
    }
}
