package DSA;

public class divisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int counter = 1; counter <= 30; counter++) {
            if (counter % 3 == 0) {
                sum += counter;
                System.out.printf("%d ", counter);

            }
        }
        System.out.println("\nThe sum of numbers between 1 and 30 divisible by 3 is: " + sum);
    }
}
