import java.util.Comparator;

public class AgeAndNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o1.getAge(), o2.getAge());
        if (res == 0) {
            return Integer.compare(o1.getName().length(), o2.getName().length());
        } else return res;
    }
}
