package DSA;

import java.util.Scanner;

public class coinTossing {

    public enum Coin {
        HEADS, TAILS
    }

   public static Coin coinToss() {
       int randomNumber = (int)(Math.random() * 2);
       if (randomNumber == 0) {
           return Coin.HEADS;
       } else {
           return Coin.TAILS;
       }
   }

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of times to toss the coin: ");
       int numberOfTimes = input.nextInt();
       int headsCount = 0;
       int tailsCount = 0;

       for (int counter = 1; counter <= numberOfTimes; counter++) {
           Coin result = coinToss();
           System.out.println("Toss #" + counter + ": " + result);

           if (result == Coin.HEADS) {
               headsCount++;
           } else {
               tailsCount++;
           }
           System.out.println("\nFinal Result:");
           System.out.println("Heads: " + headsCount);
           System.out.println("Tails: " + tailsCount);

       }
   }
}
