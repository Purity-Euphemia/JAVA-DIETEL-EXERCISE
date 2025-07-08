package DSA;

public class ContinueTest {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            if (counter == 5) {
                continue;
            }
            System.out.printf("%d ", counter);
        }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}
