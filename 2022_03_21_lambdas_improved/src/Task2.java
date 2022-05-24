import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        // Есть класс Account, у него есть поля int id, double balance, bool isLocked.
        // Написать два лямбда выражения Function<List<Account>, List<Account>>.
        // 1. отфильтровывает аккаунты таким образом, что остаются только аккаунты с положительным баллансом;
        // 2. все незаблокированные аккаунты с балансом более 100000.

        Function<List<Account>, List<Account>> task2 = (List<Account> list) -> {
            List<Account> res = new ArrayList<>();
            for (Account item : list) {
                if (item.getBalance() > 0)
                    res.add(item);
            }
            return res;
        };

        Function<List<Account>, List<Account>> anotherTask2 = (List<Account> list) -> {
            List<Account> res = new ArrayList<>();
            for (Account item : list) {
                if (!item.isLocked() && item.getBalance() > 100000)
                    res.add(item);
            }
            return res;
        };

        Account one = new Account(1, -10000000, true);
        Account two = new Account(2, 20000000, false);
        Account three = new Account(3, 30000000, true);
        Account four = new Account(4, 40000000, true);
        Account five = new Account(5, -10000, true);
        Account six = new Account(6, 1000, false);
        List<Account> newList = Arrays.asList(one, two, three, four, five, six);
        System.out.println(task2.apply(newList));
        System.out.println(newList);
        System.out.println(anotherTask2.apply(newList));
        System.out.println(newList);
    }
}
