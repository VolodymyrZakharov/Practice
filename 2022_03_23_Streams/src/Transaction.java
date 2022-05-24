public class Transaction {
    private final String uuid;
    private String state; // ("Cancelled", "Finished", "Processing")
    private long sum;
    private long date;

    public Transaction(String uuid, String state, long sum, long date) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.date = date;
    }

    public String getUuid() {
        return uuid;
    }

    public String getState() {
        return state;
    }

    public long getSum() {
        return sum;
    }

    public long getDate() {
        return date;
    }
}
