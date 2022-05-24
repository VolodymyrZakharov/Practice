import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PairwiseProblemTest {

    PairwiseProblem pp = new PairwiseProblem();

    @Test
    public void testSolve_twoElements1and2_2() {
        int[] array = {1, 2};
        long action = pp.solve(array);
        assertEquals(2, action);
    }

    @Test
    public void testSolve_threeElements_20() {
        int[] array = {1, 10, 2};
        long action = pp.solve(array);
        assertEquals(20, action);
    }

    @Test
    public void testSolve_twoElements() {
        int[] array = {100000, 100000};
        long action = pp.solve(array);
        assertEquals(10000000000L, action);
    }

    @Test
    public void testSolve_twoElementsWithZero_0() {
        int[] array = {0, 100_000};
        assertEquals(0, pp.solve(array));
    }

    @Test
    public void testSolveNew_1() {
        int[] array = {0, 0, 0, 1};
        assertEquals(0, pp.solveNew(array));
    }

    @Test
    public void testSolveNew_2() {
        int[] array = {0, 0, 0, 0, 0};
        assertEquals(0, pp.solveNew(array));
    }

    @Test
    public void testSolveNew_3() {
        int[] array = {100000, 100000, 0, 0, 0};
        assertEquals(10000000000L, pp.solveNew(array));
    }

    @Test
    public void testSolve_performanceTest() {
        int[] array = new int[100000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(Integer.MAX_VALUE);
        }
        long currentTime = System.currentTimeMillis();
        pp.solveNew(array);
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}