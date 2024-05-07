
import java.util.ArrayList;

public abstract class Account {

    protected String accountNumber;
    protected double balance;
    protected Customer owner;
    protected ArrayList<Transaction> transactionHistory = new ArrayList<>();

    public Account(String accountNumber, double initialBalance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.owner = owner;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public String getAccountDetails() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }

    public void printTransactionHistory() {
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}
