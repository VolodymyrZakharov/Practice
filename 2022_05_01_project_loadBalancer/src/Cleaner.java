public class Cleaner implements Runnable {
   private final IServerStorage serverStorage;
   private final int milliseconds;

    public Cleaner(IServerStorage serverStorage, int milliseconds) {
        this.serverStorage = serverStorage;
        this.milliseconds = milliseconds;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            serverStorage.clear(1000);
        }
    }
}
