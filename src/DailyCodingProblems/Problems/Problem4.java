package DailyCodingProblems.Problems;

public class Problem4 {

    public static int findMissingPositiveInteger(int[] numberList) {

        int[] sortedNumberList = sortListSmallToLarge(numberList);

        int missingNum = 1;

        for (int i : sortedNumberList){
            if (missingNum == i && i > 0) {
                missingNum++;
            }
        }

        return missingNum;

    }

    public static int[] sortListSmallToLarge(int[] numberList) {

        for (int i = 1; i < numberList.length; i++) {
            int curr = numberList[i];
            int j = i - 1;

            while (j >=0 && numberList[j] > curr) {
                numberList[j + 1] = numberList[j];
                j = j - 1;
            }

            numberList[j + 1] = curr;

        }
        return numberList;
    }

    public static int solution(int[] numberList) {
        if (numberList.length == 0) {
            return 1;
        }

        int missingNum = 1;

        for (int i : numberList) {
            if (i == missingNum) {
                missingNum++;
            }
        }

        return missingNum;

    }
}
