package task4;

public class Account {

    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Two-argument constructor to initialize balance
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount should be greater than 0.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Error: Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating an account with default constructor
        Account account1 = new Account();
        account1.displayBalance();
        account1.deposit(1000.0);
        account1.withdraw(500.0);

        System.out.println();

        // Creating an account with initial balance
        Account account2 = new Account(2000.0);
        account2.displayBalance();
        account2.deposit(500.0);
        account2.withdraw(2500.0);
    }
}
