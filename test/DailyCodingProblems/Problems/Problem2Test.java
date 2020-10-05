package DailyCodingProblems.Problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class Problem2Test {

    @Test
    public void testEasy() {
        int[] numberList = new int[]{3, 2, 1};
        int[] arrayProduct = Problem2.arrayProducts(numberList);

        int[] expected = new int[]{2, 3, 6};
        assertArrayEquals(expected, arrayProduct);
    }

    @Test
    public void testHard() {
        int[] numberList = new int[]{1, 2, 3, 4, 5};
        int[] arrayProduct = Problem2.arrayProducts(numberList);

        int[] expected = new int[]{120, 60, 40, 30, 24};
        assertArrayEquals(expected, arrayProduct);
    }
}
