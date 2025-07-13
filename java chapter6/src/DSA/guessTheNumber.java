package DSA;

import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 100) + 1;
        int guess = 0;
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != number) {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();

            if (guess > number) {
                System.out.println("Too high. Try again.");
            } else if (guess < number) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Congratulations, you guessed the number!");
            }
        }
        System.out.print("Do you want to play again? (yes/no)");
        String response = input.next().toLowerCase();

        if (response.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
        }

    }
}
