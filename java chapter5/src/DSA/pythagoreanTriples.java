package DSA;

public class pythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s%-12s%n", "Side1", "Side2", "Hypotenuse");
        System.out.println("--------------------------------");

        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {
                for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {
                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        System.out.printf("%-8d  %-8d  %-12d%n", side1, side2, hypotenuse);
                }
                }
            }
        }
    }
}
