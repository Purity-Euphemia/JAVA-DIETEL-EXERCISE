package DSA;

public class divisibleBy5 {
    public static String isdivisible(int number) {
        if (number % 5 == 0) {
                return number + " true is divisible by 5";
            }
        return number + " false is not divisble by 5";
    }

    public static void main(String[] args) {
        divisibleBy5 check = new divisibleBy5();
        String result = check.isdivisible(20);
        System.out.println(result);

    }
}
