import java.util.ArrayList;
import java.util.List;

public class Main {

    // Вася, Петя и Маша выдают кредиты. Маша тратит на каждый кредит от 100 до 150 милисекунд.
    // Петя тратит на каждый кредит от 150 до 200 милисекунд. Вася в обычном расположении духа тратит
    // на каждый кредит от 150 до 200 милисекунд, но иногда на него снисходит вдохновение, и он тратит
    // на последующие 3 кредита от 50 до 100 милисекунд. Вероятность того, что Вася станет вдохновленным,
    // если он не вдохновлен в данный момент, равняется 20%. Необходимо выдать 20 кредитов. Составить лист результов для работников.
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        int number = 20;
        List<Score> scores = new ArrayList<>();
        List<Person> persons = new ArrayList<>();
        Person petya = new MotivatedPerson("Petya", 150, 200, number, 50, 100, startTime, scores, 3, 20);
        Person masha = new Person("Masha", 100, 150, number, startTime, scores);
        Person vasya = new Person("Vasya", 150, 200, number, startTime, scores);
        persons.add(petya);
        persons.add(masha);
        persons.add(vasya);

        for (Person p: persons) {
            p.start();
        }
        for (Person p: persons) {
            p.join();
        }
        System.out.println(scores);
    }
}
