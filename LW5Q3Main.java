


public class LW5Q3Main{
    public static void main(String[] args) {
        // Create an instance of BankAccount
        LW5Q3BankAccount account = new LW5Q3BankAccount();

        // Deposit an amount into the account
        account.deposit(1000);
        System.out.println("Deposited: $1000");

        // Withdraw an amount from the account
        account.withdraw(500);
        System.out.println("Withdrew: $500");

        // Attempt to withdraw more than the balance
        account.withdraw(600);

        // Display the current balance
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
