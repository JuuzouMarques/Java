package OOP.entities;

public class Account {
    private int accountID;
    private String holder;
    private double balance;

    // Construtores
    public Account(int accountID, String holder) {
        this.accountID  = accountID;
        this.holder     = holder;
    }

    public Account(int accountID, String holder, double balance) {
        this.accountID  = accountID;
        this.holder     = holder;
        this.balance    = balance;
    }

    // Métodos Get e Set
    public int getAccountID() {
        return accountID;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // Métodos
    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= (value + 5.0);
    }

    public String toString() {
        return "Account " + accountID
            + ", Holder: " + holder
            + ", Balance: $ " + String.format("%.2f", balance);
    }
}
