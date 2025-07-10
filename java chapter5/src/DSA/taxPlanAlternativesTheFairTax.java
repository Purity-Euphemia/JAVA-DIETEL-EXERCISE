package DSA;

import java.util.Scanner;

public class taxPlanAlternativesTheFairTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your housing expenses: ");
        double housingExpenses = scanner.nextDouble();

        System.out.print("Enter your food expenses: ");
        double foodExpenses = scanner.nextDouble();

        System.out.print("Enter your clothing expenses: ");
        double clothingExpenses = scanner.nextDouble();

        System.out.print("Enter your transportation expenses: ");
        double transportationExpenses = scanner.nextDouble();

        System.out.print("Enter your education expenses: ");
        double educationExpenses = scanner.nextDouble();

        System.out.print("Enter your health care expenses: ");
        double healthCareExpenses = scanner.nextDouble();

        System.out.print("Enter your vacation expenses: ");
        double vacationExpenses = scanner.nextDouble();

        double totalExpenses = housingExpenses + foodExpenses + clothingExpenses + transportationExpenses + educationExpenses + healthCareExpenses + vacationExpenses;
        double taxRate = 0.23;
        double fairTax = totalExpenses * taxRate;

        System.out.printf("Your tax is $%.2f%n", fairTax);

    }
}
