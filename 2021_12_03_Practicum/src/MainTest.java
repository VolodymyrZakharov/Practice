import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main some = new Main();

    @Test
    public void test_1() {
        assertTrue(some.task8("abc", "cab"));
    }

    @Test
    public void test_2() {
        assertFalse(some.task7("sddd", "eryy"));
    }

}
