import javax.swing.plaf.SliderUI;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> list = Arrays.asList("one", "two", "three", "one");
        System.out.println(task1(list));

        Person one = new Person("Vasya", 23);
        Person two = new Person("Vova", 23);
        Person three = new Person("Sasha", 15);
        Person four = new Person("Olga", 16);
        Person five = new Person("Petya", 15);
        List<Person> list1 = Arrays.asList(one, two, three, four, five);
        System.out.println(task3(list1));

        BankAccount bankAccount1 = new BankAccount("IBAN_one", one);
        BankAccount bankAccount2 = new BankAccount("IBAN_two", two);
        BankAccount bankAccount3 = new BankAccount("IBAN_three", one);
        List<BankAccount> list2 = Arrays.asList(bankAccount1, bankAccount2, bankAccount3);
        System.out.println(task4(list2));

        System.out.println(task5(list2));

        System.out.println(task6("Hello world and hello Vasya hello vsem", "h"));

        System.out.println(task7("6h7"));

        StringBuilder ss = new StringBuilder("onere");
        System.out.println(ss.insert(3, "*").toString());

        NewBankAccount newBankAccount1 = new NewBankAccount("IBAN_1");
        NewBankAccount newBankAccount2 = new NewBankAccount("IBAN_2");
        NewBankAccount newBankAccount3 = new NewBankAccount("IBAN_3");
        List<NewBankAccount> list3 = Arrays.asList(newBankAccount1, newBankAccount2, newBankAccount3);

        NewPerson newPerson1 = new NewPerson("one", list3);
        NewPerson newPerson2 = new NewPerson("two", list3);
        NewPerson newPerson3 = new NewPerson("three", list3);
        List<NewPerson> list4 = Arrays.asList(newPerson1, newPerson2, newPerson3);

        System.out.println(task8(list4));
        System.out.println(task9(list1));
        System.out.println(task10(list1));

        List<String> studentsList = Arrays.asList("one", "one", "two", "three", "four", "fivert");
        System.out.println(task16(studentsList));
    }

    //2. Return list of names without duplicates
    public static List<String> task1(List<String> list) {
        return list.stream()
                .distinct().collect(Collectors.toList());
    }

    //3. There is class person with fields name and age.  Return map where age is a key and list of persons
    //a value public static Map<Integer>,List<Person>>mapByAge(List<Person> input)
    public static Map<Integer, List<Person>> task3(List<Person> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    //4 class Person has the field name and class BankAccount has fields IBAN and person. Return map
    // with Person as a key and list of his/her accounts as value
    public static Map<Person, List<BankAccount>> task4(List<BankAccount> list) {
        return list.stream()
                .collect(Collectors.groupingBy(BankAccount::getPerson, Collectors.toList()));
    }

    //5. return list of IBANS from BankAccount class  with * after third symbol
    public static List<String> task5(List<BankAccount> list) {
        return list.stream()
                .map(BankAccount::getIBAN)
                .map(s -> {
                    StringBuilder stringBuilder = new StringBuilder(s.substring(0, 3));
                    for (int i = 3; i < s.length(); i++) {
                        stringBuilder.append("*");
                    }
                    return stringBuilder.toString();
                }).collect(Collectors.toList());
    }

    //6. method accepts a sentence ( the words in the sentence are separated with " " ) and returns number of
    // words starting with a certain letter public static long numberOfWords(String input, String w)
    public static long task6(String input, String w) {
        String[] array = input.split(" ");
        return Arrays.stream(array)
                .filter(s -> s.toLowerCase().startsWith(w))
                .count();
    }

    //7.method accepts string and checks if the string is number
    public static boolean task7(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }

    //8.Class NewBankAccount has field String IBAN and class NewPerson has fields name and List<BankAccount>. write
    // method which returns ibans with numbers replaced with * after third symbol
    public static List<String> task8(List<NewPerson> list) {
        return list.stream()
                .flatMap(a -> a.getNewBankAccounts().stream())
                .map(s -> {
                    String iban = s.getIBAN();
                    StringBuilder stringBuilder = new StringBuilder(iban.substring(0, 3));
                    for (int i = 3; i < iban.length(); i++) {
                        stringBuilder.append("*");
                    }
                    return stringBuilder.toString();
                }).collect(Collectors.toList());
    }

    //9. Class Person has fields name and age. Return total age of those older than 17
    public static long task9(List<Person> list) {
        return list.stream()
                .filter(person -> person.getAge() > 17)
                .map(person -> person.getAge())
                .reduce((x, y) -> x + y).get();
    }

    //10. Class Person has fields name and age. Return names of those who are of legal age in Germane
    // (older than 17). Should be returned something like that: in Germany Ivan and Petr are of legal age
    public static String task10(List<Person> list) {
        return list.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getName)
                .reduce((x, y) -> "In Germany " + x + " and " + y + " are of legal age.")
                .get();
    }

    // Given list of names (strings), join the names into the following string: Students:name1,name2,name3 study java
    public static String task11(List<String> list) {
        return list.stream()
                .collect(Collectors.joining(", ", "Students: ", "."));
    }

    // using collector only, count number of elements in the list
    public static Long task12(List<Object> list) {
        return list.stream().collect(Collectors.counting());
    }

    // write a method returning max elt in integer list
    public static Integer task13(List<Integer> list) {
        return list.stream()
                .collect(Collectors.maxBy(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                })).get();
    }

    // write a method returning min elt in integer list
    public static Integer task14(List<Integer> list) {
        return list.stream()
                .collect(Collectors.minBy(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                })).get();
    }

    // write a method which groups elements of a given string list by string length and stores the grouping results in a Set. Method returns Map
    public static Map<Integer, Set<String>> task15(List<String> list) {
        return list.stream()
                .collect(Collectors
                        .groupingBy(String::length, Collectors.toSet()));
    }

    // write a method which groups elements of a given string list by string length>4 and returns map
    // where keys are true false and lists of respective elements are values
    public static Map<Boolean, List<String>> task16(List<String> list) {
        return list.stream()
                .collect(Collectors
                        .partitioningBy(str -> str.length() > 4, Collectors.toList()));
    }
}
