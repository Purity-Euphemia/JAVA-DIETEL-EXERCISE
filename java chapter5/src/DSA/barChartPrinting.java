package DSA;
import java.util.Scanner;
public class barChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers: ");


        for (int count = 0; count < 5; count++) {
            int input;

            do {
                System.out.printf("Enter number " + (count + 1) + ": ");
                input = scanner.nextInt();
            } while (input < 0 || input > 30);

            numbers[count] = input;
        }
        System.out.println("The bar chart is: ");
        for (int num : numbers) {
            for (int count = 0; count < num; count++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
