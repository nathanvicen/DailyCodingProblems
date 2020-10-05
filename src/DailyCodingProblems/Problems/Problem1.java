package DailyCodingProblems.Problems;

import java.util.List;

public class Problem1 {

    public static boolean problem1Slow(List<Integer> numberList, int k) {
        boolean canSum = false;
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++){
                if (numberList.get(i) + numberList.get(j) == k) {
                    canSum = true;
                    System.out.println(numberList.get(i) + " + " + numberList.get(j) + " = " + k);
                }
            }
        }
        return canSum;
    }

    public static boolean problem1Fast(List<Integer> numberList, int k) {
        boolean canSum = false;
        for (int num : numberList) {
            int findNum = k - num;
            if (numberList.contains(findNum)) {
                canSum = true;
            }
        }

        return canSum;
    }
}
