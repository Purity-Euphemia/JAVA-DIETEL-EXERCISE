package DSA;

import java.util.Scanner;

public class temperatureConversions {
    public static double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double toCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature");
        System.out.println("1. in Celsius to Kelvin:");
        System.out.println("2. in Kelvin to Celsius:");
        System.out.print("Enter choice (1 or 2): ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Celsius:");
            double celsius = input.nextDouble();
            double kelvin = toKelvin(celsius);
            System.out.printf("Temperature in Kelvin is %.2f%n", kelvin);
        }
        else if (choice == 2) {
            System.out.println("Enter temperature in Kelvin:");
            double kelvin = input.nextDouble();
            double celsius = toCelsius(kelvin);
            System.out.printf("Temperature in Celsius is %.2f%n", celsius);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
