package DSA;

import java.util.Scanner;

public class globalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the largest planet in our solar system?",
                "What is the hottest planet in our solar system?",
                "What is the coldest planet in our solar system?",
                "What is the largest moon in our solar system?",
                "What is the hottest moon in our solar system?",

        };

        String[][] answers = {
                {"1) jupiter", "2) Venus", "3) Earth", "4) Mars"},
                {"1) Jupiter", "2) venus", "3) Uranus", "4) Neptune"},
                {"1) Mars", "2) Jupiter", "3) Saturn", "4) Uranus"},
                {"1) Mercury", "2) Venus", "3) Earth", "4) Mars"},
                {"1) Jupiter", "2) Saturn", "3) Uranus", "4) Neptune"},

        };

        int[] correctAnswers = {1, 2, 4, 1, 4};

        int score = 0;

        for (int counter = 0; counter < questions.length; counter++) {
            System.out.println(questions[counter]);
            for (String answer : answers[counter]) {
                System.out.println(answer);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == correctAnswers[counter]) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Your score is " + score + " out of " + questions.length);

        if (score == 5) {
            System.out.println("Congratulations! You got all the questions correct!");
        } else if (score == 4) {
            System.out.println("Very good! You got 4 questions correct!");
        } else {
            System.out.println("Time to practice!");
            System.out.println("Good luck!");
            System.out.println("Here are some useful websites for practice:");
            System.out.println("https://www.nasa.gov/specials/virtual-guest/index.html");
            System.out.println("https://www.nasa.gov/specials/virtual-host/index.html");
            System.out.println("https://www.nasa.gov/specials/virtual-telescope/index.html");
            System.out.println("https://www.nasa.gov/specials/virtual-instrument/index.html");
        }
    }
}
