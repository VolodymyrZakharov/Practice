import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Написать метод, принимающий строку, содержащую слова разделенные пробелом и два
        // функциональных интерфейса - function and predicate. Метод должен предоставлять
        // возможность реализации следующих лямбда выражений
        // 1. При длине слова=3 изменить все буквы этого слова на строчные и вернуть измененную строку
        String input = "ghh hghghg Ghh GHJkk hjjJ";
        Predicate<String> predicate1 = (str) -> str.length() == 3;
        Function<String, String> function1 = String::toLowerCase;
        System.out.println(transforming(input, predicate1, function1));

        // 2. При длине слова=3 изменить все буквы этого слова на заглавные и вернуть измененную строку
        Predicate<String> predicate2 = (str) -> str.length() == 3;
        Function<String, String> function2 = String::toLowerCase;
        System.out.println(transforming(input, predicate2, function2));

        // 3. При длине слова=4 изменить все буквы этого слова на строчные и вернуть измененную строку
        Predicate<String> predicate3 = (str) -> str.length() == 4;
        Function<String, String> function3 = String::toLowerCase;
        System.out.println(transforming(input, predicate3, function3));

        //4. При длине слова=4 изменить все буквы этого слова на заглавные и вернуть измененную строку
        Predicate<String> predicate4 = (str) -> str.length() == 4;
        Function<String, String> function4 = String::toUpperCase;
        System.out.println(transforming(input, predicate4, function4));

        //5. При длине слова=5 изменить все буквы этого слова на звездочки(*****) и вернуть измененную строку
        Predicate<String> predicate5 = (str) -> str.length() == 5;
        Function<String, String> function5 = str -> {
            StringBuilder res = new StringBuilder("");
            for (int i = 0; i < str.length(); i++) {
                res.append("*");
            }
            return res.toString();
        };
        System.out.println(transforming(input, predicate5, function5));
        Address address1 = new Address("one", 1);
        Address address2 = new Address("two", 2);
        Address address3 = new Address("three", 3);
        Person person1 = new Person("Vasya", 15, address1);
        Person person2 = new Person("Petya", 18, address2);
        Person person3 = new Person("Vova", 45, address3);


       List<Person> list = Arrays.asList(person1, person2, person3);
        System.out.println(addressOlder17(list));
    }

    public static String transforming(String input, Predicate<String> predicate, Function<String, String> function) {
        String[] array = input.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i]))
                array[i] = function.apply(array[i]);
        }
        return Arrays.toString(array);
    }

    public static List<Address> addressOlder17(List<Person> input){
       return input.stream()
                .filter(person -> person.getAge()>17)
                .map(Person::getAddress).collect(Collectors.toList());
    }
}
