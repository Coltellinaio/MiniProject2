
import java.time.LocalDate;

public class Transaction {
    private String type;
    private double amount;
    private LocalDate date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDate.now();
    }

    

    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
