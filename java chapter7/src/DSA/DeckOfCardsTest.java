package DSA;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        for (int card = 0; card <= 52; card++){
            System.out.printf("%-19s", deck.dealCard());
            if (card % 4 == 0){
                System.out.println();
            }
        }
    }
}
