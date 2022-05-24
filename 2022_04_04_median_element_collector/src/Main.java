import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    // Необходимо реализовать коллектор, который будет выдавать медианный элемент стрима Integers
    // {5, 0, 15} -> {0, 5, 15} -> 5
    // {5, 0, 15, -10, -17} -> {-17, -10, 0, 5, 15} -> 0
    // {5, 0, 15, -10, -17, 239} -> {-17, -10, 0, 5, 15, 239} -> 2.5
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(-17, -10, 0, 5, 15, 239);
        Collector<Integer, List<Integer>, Double> medianElementCollector = new MedianElementCollector();
        double median = intStream.collect(medianElementCollector);
        System.out.println(median);

        Stream<Double> doubleStream = Stream.of(3.2, 5.6, 8.9, 0.3, 6.7, 8.8);
        Collector<Double, List<Double>, List<Double>> normalizedCollector = new NormalizedCollector();
        System.out.println(doubleStream.collect(normalizedCollector));
    }
}
