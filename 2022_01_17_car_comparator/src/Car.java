public class Car implements Comparable<Car> {
    int km;
    int year;
    String maker;

    //TODO create a comparator, which compares two cars. The car must be of a higher priority, if it has newer year
    // km and then it has less km.
    public Car(int km, int year, String maker) {
        this.km = km;
        this.year = year;
        this.maker = maker;
    }

    @Override
    public int compareTo(Car o) {
        if (o.year > year)
            return 1;
        else if (o.year < year)
            return -1;
        else return km - o.km;
    }

    @Override
    public String toString() {
        return maker;
    }
}
