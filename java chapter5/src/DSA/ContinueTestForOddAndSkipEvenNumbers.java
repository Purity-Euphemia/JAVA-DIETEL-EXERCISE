package DSA;

public class ContinueTestForOddAndSkipEvenNumbers {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.printf("%d ", counter);
        }

        System.out.printf("%nUsed continue to skip printing even numbers");
    }
}
