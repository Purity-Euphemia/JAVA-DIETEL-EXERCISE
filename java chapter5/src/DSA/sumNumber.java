package DSA;

public class sumNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 2; count <= 20; count+=2) {
            sum += count;
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
