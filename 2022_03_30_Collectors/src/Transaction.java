public class Transaction {
   private final String uuid;
   private long sum;
   private final String accountUuid;

    public Transaction(String uuid, long sum, String accountUuid) {
        this.uuid = uuid;
        this.sum = sum;
        this.accountUuid = accountUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
