package DSA;

public class modifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double InterestRate = 5.0;
        int numberTime = 4;
        int years = 3;
        double amount = principal * Math.pow(1 + (InterestRate / 100) / numberTime,numberTime * years);
        double compoundInterest = amount - principal;

         System.out.printf("Compound interest after %d years is $%.2f%n",years,compoundInterest);
         System.out.printf("The interest earned is $%.2f%n",compoundInterest - principal);
         System.out.printf("The amount after %d is $%.2f%n",years, amount);

    }
}
