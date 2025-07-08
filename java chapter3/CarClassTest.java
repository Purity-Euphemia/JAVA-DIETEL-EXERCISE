public class CarClassTest {
    public static void main(String[] args) {
        CarClass carClass = new CarClass("Venza", "2024", 1000.250);
        CarClass carClass2 = new CarClass("Lexus", "2022", 500.350);

        double price = carClass.getPrice();
        double price2 = carClass2.getPrice();

        System.out.printf("The price of the car one %.2f%n", price);
        System.out.printf("The price of the car two %.2f%n", price2);

        double discount = carClass.getPrice() * 0.05;
        double discount2 = carClass2.getPrice() * 0.07;

        System.out.printf("The discount of the car one %.2f%n", discount);
        System.out.printf("The discount of the car two %.2f%n", discount2);
    }
}
