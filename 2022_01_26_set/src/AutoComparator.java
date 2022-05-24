import java.util.Comparator;

public class AutoComparator implements Comparator<Task2.Auto> {

    @Override
    public int compare(Task2.Auto o1, Task2.Auto o2) {
        if (o1.model.compareTo(o2.model) == 0) {
            return Integer.compare(o1.price, o2.price);
        } else return o1.model.compareTo(o2.model);
    }
}
