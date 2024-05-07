public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, Customer owner, double interestRate) {
        super(accountNumber, initialBalance, owner);
        this.interestRate = interestRate;
        Transaction THistory = new Transaction(accountNumber, interestRate);
        
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

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }
}

