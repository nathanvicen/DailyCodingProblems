package DailyCodingProblems.Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static int[] arrayProducts(int[] numberList) {

        int[] productArray = new int[numberList.length];

        for (int i = 0; i < numberList.length; i++) {
            List<Integer> numbersToMultiply = new ArrayList<>();
            for (int j = 0; j < numberList.length; j++) {
                if (i == j) {
                    //
                } else {
                    numbersToMultiply.add(numberList[j]);
                }
            }
            int product = 0;
            for (int k = 0; k < numbersToMultiply.size(); k++) {
                if (k == 0) {
                    product = numbersToMultiply.get(k);
                } else {
                    product = product * numbersToMultiply.get(k);
                }
            }
            productArray[i] = (product);
        }

        return productArray;
    }
}
