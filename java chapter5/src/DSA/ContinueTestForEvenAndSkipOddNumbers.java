package DSA;

public class ContinueTestForEvenAndSkipOddNumbers {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 1) {
                continue;
            }
            System.out.printf("%d ", counter);
        }
        System.out.printf("%nUsed continue to skip printing odd numbers");
    }
}
