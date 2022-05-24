import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {
    IRandomGen iRandomGen;

    public RandomGenerator(IRandomGen iRandomGen) {
        this.iRandomGen = iRandomGen;
    }

    public List<Integer> generate(int a){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
           list.add(iRandomGen.nextInt());
        }
        return list;
    }
}
