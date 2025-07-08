public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;


    if (balance > 0.0){
        this.balance = balance;
    }

    }

    public double deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
        return balance;
    }

    public String withdraw(double withdrawAmount) {
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
            return withdrawAmount + " " + balance;
        } else {
            return "Insufficient funds";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}