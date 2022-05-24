import java.util.List;

public class Account {
   private String uuid;
   private long balance;
   private List<Transaction> transactions;

    public Account(String uuid, long balance, List<Transaction> transactions) {
        this.uuid = uuid;
        this.balance = balance;
        this.transactions = transactions;
    }

    public long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
