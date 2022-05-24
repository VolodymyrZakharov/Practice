import java.util.List;
import java.util.Random;

public class Person extends Thread {

    final String name;
    final int minTime;
    final int maxTime;
    final int number;
    final long startTime;
    final List<Score> scores;

    private final Random rnd = new Random();

    public Person(String name, int minTime, int maxTime, int number, long startTime, List<Score> scores) {
        this.name = name;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.number = number;
        this.startTime = startTime;
        this.scores = scores;
    }

    @Override
    public void run() {
            for (int i = 0; i < number; i++) {
                int oneCreditTime = rnd.nextInt((maxTime - minTime + 1) + minTime);
                try {
                    Thread.sleep(oneCreditTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            long allCreditTime = System.currentTimeMillis() - startTime;
            Score score = new Score(name, allCreditTime);
        synchronized (scores) {
            scores.add(score);
        }
    }
}
