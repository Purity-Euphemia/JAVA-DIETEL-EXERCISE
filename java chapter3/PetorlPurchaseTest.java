public class PetorlPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Abuja", "gas", 75, 120.8, 7.5);

        petrolPurchase.getStationLocation();
        petrolPurchase.getPetol();
        petrolPurchase.getQuantity();
        petrolPurchase.getPrice();
        petrolPurchase.getPercentageDiscount();


        System.out.printf("The Purchase Amount of the gas %.2f%n", petrolPurchase.getPurchaseAmount());
        System.out.printf("The quantity Amount of the gas %d%n", petrolPurchase.getQuantity());
        System.out.printf("The price of the gas %.2f", petrolPurchase.getPrice());
    }
}
