import java.util.ArrayList;

public abstract class Customer {

    protected String name;
    protected String address;
    protected ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void printAccountsDetails() {
        for (Account account : accounts) {
            System.out.println(account.getAccountDetails());
        }
    }
}
