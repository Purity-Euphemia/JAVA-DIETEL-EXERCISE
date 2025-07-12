package DSA;

public class Scope {
    private static int value = 1;

    public static void main(String[] args) {
        int value = 5;

        System.out.printf("local x in main is %d%n", value);
        useLocalVariable();
        useField();
        useLocalVariable();
        useField();
        System.out.printf("%nlocal x in main is %d%n", value);
    }

    public static void useLocalVariable() {
        int value = 25;
        System.out.printf("local value on entering method useLocalVariable is %d%n", value);
        ++value;
        System.out.printf("local value on exiting method useLocalVariable is %d%n", value);
    }

    public static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n", value);
        value *= 10;
        System.out.printf("field x on exiting method useField is %d%n", value);
    }
}
