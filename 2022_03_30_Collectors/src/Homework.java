import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Homework {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(task_1(Arrays.stream(array).boxed()));
        System.out.println(task_2(Arrays.stream(array).boxed()));

        List<String> list = Arrays.asList("one", "two", "three", "abba", "ghhg");
        System.out.println(task_3(list));
        System.out.println(task_4(list));

        Transaction one = new Transaction("first", 100, "one");
        Transaction two = new Transaction("second", 150, "two");
        Transaction three = new Transaction("third", 200, "three");
        Transaction four = new Transaction("forth", 250, "one");
        Transaction five = new Transaction("fifth", 300, "three");
        List<Transaction> list2 = Arrays.asList(one, two, three, four, five);
        System.out.println(totalTransactionsByAccount(list2));

        LogEntry logEntry1 = new LogEntry("1", "one");
        LogEntry logEntry2 = new LogEntry("2", "two");
        LogEntry logEntry3 = new LogEntry("3", "three");
        LogEntry logEntry4 = new LogEntry("1", "one");
        LogEntry logEntry5 = new LogEntry("3", "two");
        List<LogEntry> list3 = Arrays.asList(logEntry1, logEntry2, logEntry3, logEntry4, logEntry5);
        System.out.println(numberOfEntry(list3));

        System.out.println(numberOfUniqueEntry(list3));
        System.out.println(setOfUniqueEntry(list3));

    }

    // Есть стрим Stream<Integer>. Посчитать сумму квадратов чисел из него. (Используя коллекторы)
    public static int task_1(Stream<Integer> stream) {
        return stream.collect(summingInt(a -> a * a));
    }

    // Есть стрим Stream<Integer>. Посчитать произведение квадратов чисел из него. (Используя коллекторы)
    public static int task_2(Stream<Integer> stream) {
        return stream.collect(reducing(1, a -> a * a, (x, y) -> x * y));
    }

    // Есть лист строк.
    //Получить из него Map<Boolean, List<String>>, напротив true в котором будут собраны все палиндромы из листа, а напротив false все остальное
    public static Map<Boolean, List<String>> task_3(List<String> list) {
        return list.stream()
                .collect(partitioningBy(str -> str.contentEquals(new StringBuffer(str).reverse())));
    }

    // Есть лист строк.
    //получить Map<Boolean, Long>, который в качестве значений содержит количества палиндромов и непалиндромов.
    public static Map<Boolean, Long> task_4(List<String> list) {
        return list.stream()
                .collect(partitioningBy(str -> str.contentEquals(new StringBuffer(str).reverse()), counting()));
    }

    // 4. Есть class Transaction{String uuid; long sum; String accountUuid}. Посчитать сумму транзакций для каждого аккаунта.
    // Map<String, Long> totalTransactionsByAccount
    public static Map<String, Long> totalTransactionsByAccount(List<Transaction> transactionList) {
        return transactionList.stream()
                .collect(groupingBy(Transaction::getAccountUuid, summingLong(Transaction::getSum)));
    }

    //  Есть class LogEntry{String login, String url} Посчитать для каждого url, сколько раз он был тыкнут
    public static Map<String, Long> numberOfEntry(List<LogEntry> list){
       return list.stream()
                .collect(groupingBy(LogEntry::getUrl, counting()));
    }

    //  Есть class LogEntry{String login, String url}
    // Посчитать количество уникальных посещений каждого url (необходимо обратить внимание на некоторые коллекторы, которые не были упомянуты на занятии)
    public static Map<String, Integer> numberOfUniqueEntry(List<LogEntry> list){
        return list.stream()
                .collect(Collectors.groupingBy(LogEntry::getUrl,
                        mapping(LogEntry::getLogin,
                                collectingAndThen(toSet(), Set::size) ) ));
    }

    //  Есть class LogEntry{String login, String url}
    // Вывести для каждого аккаунта Set посещенных страниц
    public static Map<String, Set<String>> setOfUniqueEntry(List<LogEntry> list){
        return list.stream()
                .collect(Collectors.groupingBy(LogEntry::getLogin,
                        mapping(LogEntry::getUrl, toSet())));
    }
}

