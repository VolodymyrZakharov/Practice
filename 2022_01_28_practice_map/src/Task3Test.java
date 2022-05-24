import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    private Main main

    @Test
    public void test3(){
        List <String> list = Arrays.asList("Ivan", "Ivan", "Vasya", "Vova");
        assertEquals(2, Task3.nameByNumber(list, "Ivan"));
    }
}