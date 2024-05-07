
public class CheckingAccount extends Account {

    private static final double INTEREST_RATE = 3.0;

    public CheckingAccount(String accountNumber, double initialBalance, Customer owner) {
        super(accountNumber, initialBalance, owner);
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
