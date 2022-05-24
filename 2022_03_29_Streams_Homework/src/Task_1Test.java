import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Task_1Test {

    Task_1 task_1 = new Task_1();
    List<String> list = Arrays.asList("one", "three", "two");
    Set<String> set = new HashSet<>(list);

    @Test
    public void testNotRepeat() {
        String str = "one one two two three three";
        assertLinesMatch(list, task_1.dictionary(set, str));
    }

    @Test
    public void testComparator() {
        String str = "one two three";
        assertLinesMatch(list, task_1.dictionary(set, str));
    }

    @Test
    public void testDifferentWords() {
        String str = "one two three four five six seven";
        assertLinesMatch(list, task_1.dictionary(set, str));
    }

    @Test
    public void testPunctuation() {
        String str = "one, two! three:";
        assertLinesMatch(list, task_1.dictionary(set, str));
    }

    @Test
    public void testLowerUpperCase() {
        String str = "One, tWo! three:";
        assertLinesMatch(list, task_1.dictionary(set, str));
    }



}