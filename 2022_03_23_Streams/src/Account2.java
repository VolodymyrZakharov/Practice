public class Account2 {
   private final String uuid;
   private long sum;
   private boolean isLocked;

    public Account2(String uuid, long sum, boolean isLocked) {
        this.uuid = uuid;
        this.sum = sum;
        this.isLocked = isLocked;
    }

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
