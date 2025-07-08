package DSA;

public class doWhileTestForOddNumber {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.printf("%d ", counter);
            counter += 2;
        } while (counter <= 10);

        System.out.println();
    }
}
