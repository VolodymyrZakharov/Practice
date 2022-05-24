import java.util.Random;

// the rule must generate random numbers between 'min' inclusive and 'max' exclusive.
// min and max must be the fields of the class
public class RangeRandomRule implements IRandomRule {

    private final int min;
    private final int max;
    private final Random rnd = new Random();

    public RangeRandomRule(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int nextInt() {
        int n = max - min;
        if (n == 0) {
            throw new IndexOutOfBoundsException();
        }
        return min + rnd.nextInt(Math.abs(n));
    }
}