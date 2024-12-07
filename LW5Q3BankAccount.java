// The BankAccount Class
public class LW5Q3BankAccount {
    // Private variable to store the account balance
    private double balance;

    // Constructor to initialize the balance to 0
    public LW5Q3BankAccount() {
        this.balance = 0;
    }

    // Public method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
        } else if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Public method to retrieve the current balance
    public double getBalance() {
        return balance;
    }}

