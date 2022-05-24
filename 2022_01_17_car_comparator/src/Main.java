import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car(50000, 2015, "BMW"), new Car(100000, 2016, "Mercedes"), new Car(6000, 2016, "Opel"));
        cars.sort(Car::compareTo);
        System.out.println(cars);

        List<News> news = Arrays.asList(new News(3, "Hello world"), new News(3, "Hello"), new News(9, "abc"), new News(9, "abcd"));
        Collections.sort(news, News::compareTo);
        System.out.println(news);
    }
}