package DSA;

public class diamondPrinting {
    public static void main(String[] args) {
        int value = 5;

        for (int counter = 1; counter <= value; counter++) {
            for (int count = 1; count <= value - counter; count++) {
                System.out.print(" ");
            }
        for (int star = 1; star <= 2 * counter - 1; star++) {
            System.out.print("*");
        }
        System.out.println();
        }

        for (int counter = value - 1; counter >= 1; counter--) {
            for (int count = 1; count <= value - counter; count++) {
                System.out.print(" ");
            }
        for (int star = 1; star <= 2 * counter - 1; star++) {
            System.out.print("*");
        }
        System.out.println();
        }

    }
}
