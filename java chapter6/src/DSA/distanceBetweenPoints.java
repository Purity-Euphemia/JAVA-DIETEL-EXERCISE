package DSA;

import java.util.Scanner;

public class distanceBetweenPoints {
    public static double distance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("Enter point 1 (x, y): ");
       double x1 = input.nextDouble();
       double y1 = input.nextDouble();
       System.out.print("Enter point 2 (x, y): ");
       double x2 = input.nextDouble();
       double y2 = input.nextDouble();
       double distance = distance(x1, y1, x2, y2);
       System.out.printf("The distance between the two points is %.2f%n", distance);
    }


}
