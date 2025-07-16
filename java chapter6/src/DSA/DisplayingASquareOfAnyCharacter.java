package DSA;

public class DisplayingASquareOfAnyCharacter {
    public static void main(String[] args) {
        char character = '#';
        for (int counter = 1; counter <= 5; counter++) {
            for (int counter2 = 1; counter2 <= 5; counter2++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
