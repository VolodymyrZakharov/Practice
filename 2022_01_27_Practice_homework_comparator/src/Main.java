import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee vasiliy = new Employee(1, "vasiliy", 20, 3000);
        Employee petya = new Employee(2, "petya", 20, 2000);
        Employee vova = new Employee(3, "vova", 29, 1000);
        Employee sasha = new Employee(4, "sasha", 33, 15000);

        List<Employee> list = Arrays.asList(vasiliy, petya, vova, sasha);
        list.sort(Employee::compareTo);
        System.out.println(list);

        list.sort(new SalaryComparator());
        System.out.println(list);

        list.sort(new AgeComparator());
        System.out.println(list);

        list.sort(new NameComparator());
        System.out.println(list);

        list.sort(new AgeAndNameComparator());
        System.out.println(list);
    }
}
