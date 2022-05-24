import java.util.Comparator;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Person o) {
        if (o.age > age) {
            return -1;
        } else return 1;
    }
}
