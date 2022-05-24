import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task_1 {
    // Есть словарь плохих слов (Set<String>) и текст. Написать метод, который принимает словарь плохих слов и текст,
    // а возвращает список (лист) плохих слов, найденных в тексте в алфавитном порядке (не повторяясь).
    // List<String> function(Set<String> badWords, String text);

    public List<String> dictionary(Set<String> set, String text) {

        return Arrays.stream(text.split("[ ,.-:;!?]+"))
                .map(String::toLowerCase)
                .distinct()
                .filter(set::contains)
                .sorted()
                .collect(Collectors.toList());
    }
}

