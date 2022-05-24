import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class TestTask1 {

    Task1 task = new Task1();

    @Test
    public void test1() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        map.put("c", "You");

    }
}
