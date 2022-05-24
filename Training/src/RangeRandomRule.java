import java.util.Random;

public class RangeRandomRule implements IRandomGen {

    private int min;
    private int max;
    Random random = new Random();

    public RangeRandomRule(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int nextInt() {
        int dif = max - min;
        if (dif == 0) throw new IndexOutOfBoundsException();
        return min + random.nextInt(Math.abs(dif));
    }
}
