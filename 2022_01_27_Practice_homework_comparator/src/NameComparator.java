import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
