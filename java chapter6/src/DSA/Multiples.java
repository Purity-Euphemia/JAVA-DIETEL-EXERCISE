package DSA;

public class Multiples {
    public boolean isMultiple(int number, int multiple) {
        if (multiple % number == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Multiples check = new Multiples();
        System.out.println(check.isMultiple(10, 2));
    }
}
