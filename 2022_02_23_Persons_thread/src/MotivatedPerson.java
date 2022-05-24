import java.util.List;
import java.util.Random;

public class MotivatedPerson extends Person {

    Random rnd = new Random();
    private final int newMinTime;
    private final int newMaxTime;
    private final int motivatedCredits;
    private final int probability;

    public MotivatedPerson(String name, int minTime, int maxTime, int number, int newMinTime, int newMaxTime, long startTime, List<Score> scores, int motivatedCredits, int probability) {
        super(name, minTime, maxTime, number, startTime, scores);
        this.newMaxTime = newMaxTime;
        this.newMinTime = newMinTime;
        this.motivatedCredits = motivatedCredits;
        this.probability = probability;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            int a = rnd.nextInt(100);
            if (a < probability) {
                for (int j = 0; j < motivatedCredits & i < number; j++, i++) {
                    int oneCreditTime = rnd.nextInt((newMaxTime - newMinTime + 1) + newMinTime);
                    try {
                        Thread.sleep(oneCreditTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                int oneCreditTime = rnd.nextInt((maxTime - minTime + 1) + minTime);
                try {
                    Thread.sleep(oneCreditTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long allCreditTime = System.currentTimeMillis() - startTime;
        Score score = new Score(name, allCreditTime);
        synchronized (scores) {
            scores.add(score);
        }
    }
}
