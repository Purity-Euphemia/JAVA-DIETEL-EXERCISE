package DSA;

import java.util.Scanner;

public class Sphere{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        double volume = 4.0/3.0 * Math.PI * radius * radius * radius;
        System.out.printf("The volume of the sphere is %f%n", volume);
    }


}