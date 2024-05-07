public class Test {
    private Customer individualCustomer1, individualCustomer2;
    private Portfolio portfolio1, portfolio2;
    private Account checkingAccount, savingsAccount1, savingsAccount2;
    private Transaction deposit1, deposit2, transfer1;

    public void setup() {
        individualCustomer1 = new IndividualCustomer("John Doe", "123 Main St","Male" ,"5551234");
        individualCustomer2 = new IndividualCustomer("Jane Smith", "456 Elm St", "Female" ,"5555678");

        portfolio1 = new Portfolio();
        portfolio2 = new Portfolio();

        checkingAccount = new CheckingAccount(individualCustomer1, 1000);
        savingsAccount1 = new SavingsAccount(individualCustomer1, 500, 0.02);
        savingsAccount2 = new SavingsAccount(individualCustomer1, 800, 0.03);

        deposit1 = new Transaction(500, "Deposit");
        deposit2 = new Transaction(200, "Deposit");
        transfer1 = new Transaction(300, "Transfer");
    }

    public void testAccountManagement() {
        individualCustomer1.createAccount(checkingAccount);
        individualCustomer1.createAccount(savingsAccount1);
        portfolio1.addAccount(savingsAccount1);
        portfolio1.addAccount(checkingAccount);

        assertEquals(2, portfolio1.getNumberOfAccounts());

        portfolio1.removeAccount(savingsAccount1);
        assertEquals(1, portfolio1.getNumberOfAccounts());

        String accountDetails = checkingAccount.toString();
        assertTrue(accountDetails.contains("Balance: 1000"));
    }

    public void testTransactionExecution() {
        individualCustomer1.executeTransaction(checkingAccount, deposit1);
        assertEquals(1500, checkingAccount.getBalance());

        individualCustomer1.executeTransaction(savingsAccount2, deposit2);
        assertEquals(1000, savingsAccount2.getBalance());

        individualCustomer1.transferFunds(checkingAccount, savingsAccount2, transfer1);
        assertEquals(1200, savingsAccount2.getBalance());
        assertEquals(1200, checkingAccount.getBalance());
    }

    public void testPortfolioManagement() {
        portfolio2.addAccount(checkingAccount);
        assertEquals(1500, portfolio2.getTotalValue());

        portfolio1.compare(portfolio2);
        assertFalse(portfolio1.equals(portfolio2));

        individualCustomer2.createAccount(checkingAccount);
        portfolio2.printAccounts();
    }
}
