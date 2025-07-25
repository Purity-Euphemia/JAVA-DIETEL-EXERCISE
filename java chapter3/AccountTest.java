import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;
        double withdrawAmount;

        System.out.print("Please enter your deposit amount for the account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.print("Please enter your deposit amount for the account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Please enter your withdraw amount for the account1: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdraw %.2f to account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        System.out.print("Please enter your withdraw amount for the account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdraw %.2f to account1 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);


        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }
}
