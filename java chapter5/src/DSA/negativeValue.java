package DSA;
import java.util.Scanner;
public class negativeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int value = scanner.nextInt();

int result = (value < 0) ? -1 : (value == 0 ? 0 : 1);

       switch (result) {
           case -1:
               System.out.println("Negative value");
               break;
           case 0:
               System.out.println("Zero");
               break;
           default:
               System.out.println("Positive value");
               break;
       }

    }
}
