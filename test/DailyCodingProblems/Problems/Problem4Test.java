package DailyCodingProblems.Problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem4Test {

    @Test
    public void testSort() {
        int[] numberList = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = Problem4.sortListSmallToLarge(numberList);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMissingIntEasy() {
        int[] numberList = new int[]{1, 2, 0};

        int missingInt = Problem4.findMissingPositiveInteger(numberList);

        assertEquals(3, missingInt);
    }

    @Test
    public void findMissingIntMedium() {
        int[] numberList = new int[]{3, 4, -1, 1};

        int missingInt = Problem4.findMissingPositiveInteger(numberList);

        assertEquals(2, missingInt);
    }

    @Test public void findMissingIntHard(){
        int[] numberList = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int missingInt = Problem4.findMissingPositiveInteger(numberList);

        assertEquals(1, missingInt);
    }

    @Test public void testSolutionEasy() {
        int[] numberList = new int[]{1, 2, 0};

        int missingInt = Problem4.solution(numberList);

        assertEquals(3, missingInt);
    }

    @Test
    public void testSolutionMedium() {
        int[] numberList = new int[]{3, 4, -1, 1};

        int missingInt = Problem4.solution(numberList);

        assertEquals(2, missingInt);
    }

    @Test public void testSolutionHard() {
        int[] numberList = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int missingInt = Problem4.solution(numberList);

        assertEquals(1, missingInt);
    }

}
