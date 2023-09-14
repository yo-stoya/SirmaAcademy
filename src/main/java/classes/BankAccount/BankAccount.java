package classes.BankAccount;

public class BankAccount {
    private int id;
    private double balance;
    private static double interest = 0.02;
    private static int counter;

    public BankAccount(double balance) {
        counter++;
        id = counter;
        this.balance = balance;
    }

    public BankAccount() {
        this(0.0);
    }

    public double getInterest(int years) {
        return interest * years;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static void setInterest(double interest) {
        BankAccount.interest = interest;
    }
}
