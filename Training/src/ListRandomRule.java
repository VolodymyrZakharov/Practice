import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListRandomRule implements IRandomGen{
   private List<Integer> list;
   Random random = new Random();

    public ListRandomRule(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public int nextInt() {
        return list.get(random.nextInt(list.size()));
    }
}
