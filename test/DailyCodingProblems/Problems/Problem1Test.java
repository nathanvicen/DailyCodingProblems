package DailyCodingProblems.Problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class Problem1Test {

    @Test
    public void testSlowTrue() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(3);
        numberList.add(7);
        int k = 17;

        assertTrue(Problem1.problem1Slow(numberList, k));
    }

    @Test
    public void testSlowFalse() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(3);
        numberList.add(7);
        int k = 150;

        assertFalse(Problem1.problem1Slow(numberList, k));
    }

    @Test
    public void testFastTrue() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(3);
        numberList.add(7);
        numberList.add(1);
        numberList.add(14);
        numberList.add(25);
        numberList.add(0);
        numberList.add(2);
        numberList.add(3);
        numberList.add(22);
        numberList.add(42);
        numberList.add(26);
        numberList.add(10);
        numberList.add(10);
        numberList.add(15);
        int k = 17;

        assertTrue(Problem1.problem1Fast(numberList, k));
    }

    @Test
    public void testFastFalse() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(3);
        numberList.add(7);
        numberList.add(1);
        numberList.add(14);
        numberList.add(25);
        numberList.add(0);
        numberList.add(2);
        numberList.add(3);
        numberList.add(22);
        numberList.add(42);
        numberList.add(26);
        numberList.add(10);
        numberList.add(10);
        numberList.add(15);
        int k = 150;

        assertFalse(Problem1.problem1Fast(numberList, k));
    }

    @Test
    public void testRuntime() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(3);
        numberList.add(7);
        numberList.add(1);
        numberList.add(14);
        numberList.add(25);
        numberList.add(0);
        numberList.add(2);
        numberList.add(3);
        numberList.add(22);
        numberList.add(42);
        numberList.add(26);
        numberList.add(10);
        numberList.add(10);
        numberList.add(15);
        int k = 17;

        long slowStart = System.nanoTime();
        boolean canSumSlow = Problem1.problem1Slow(numberList, k);
        long slowEnd = System.nanoTime();
        long slowDuration = slowEnd - slowStart;

        long fastStart = System.nanoTime();
        boolean canSumFast = Problem1.problem1Fast(numberList, k);
        long fastEnd = System.nanoTime();
        long fastDuration = fastEnd - fastStart;

        assertTrue(canSumSlow);
        assertTrue(canSumFast);
        assertTrue(fastDuration < slowDuration);
    }

}
