public class Account {
    private final int id;
    private double balance;
    private boolean isLocked;

    public Account(int id, double balance, boolean isLocked) {
        this.id = id;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
