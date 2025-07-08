package DSA;

public class BreakTest {
    public static void main(String[] args) {
        int counter;

        for (counter = 1; counter <= 10; counter++) {
            if (counter == 5) {
                break;
            }
            System.out.printf("%d ", counter);
        }
        System.out.printf("%nBroke out of loop at count = %d%n", counter);
    }
}
