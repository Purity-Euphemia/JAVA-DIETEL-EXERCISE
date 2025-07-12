package DSA;

import java.util.Scanner;

public class Sphere2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        System.out.printf("The volume of the sphere is %f%n", shereVolume(radius));
    }

    public static double shereVolume(double radius) {
        double volume =  (4.0 / 3.0) * Math.PI * radius * radius * radius;
        return volume;
    }
}
