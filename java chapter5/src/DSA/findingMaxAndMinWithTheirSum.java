package DSA;
import java.util.Scanner;
public class findingMaxAndMinWithTheirSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number = scanner.nextInt();

        int max = number;
        int min = number;
        int sum = 0;
        int count = 0;

        for (int counter = 0; counter <= 10; counter++) {
            System.out.println("Enter the second number: ");
            number = scanner.nextInt();

            if(number > max) {
                max = number;
                count++;
            }else if(number < min) {
                min = number;
                count++;
            }

            }
        sum = max + min;
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
        System.out.println("The sum of the numbers is " + sum);
        }

    }

