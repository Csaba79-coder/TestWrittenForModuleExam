package main.model;

import java.util.HashSet;
import java.util.Set;

public class CountSameNumbers {

    public static int countSameNumbers(int[] firstNumbers, int[] secondNumbers) {

        Set<String> set = new HashSet<>();

        if (firstNumbers != null && firstNumbers.length > 0 &&
                secondNumbers != null && secondNumbers.length > 0) {
            for (int i = 0; i < firstNumbers.length; i++) {
                for (int j = 0; j < secondNumbers.length; j++) {
                    if (firstNumbers[i] == secondNumbers[j]) {
                        set.add(String.valueOf(firstNumbers[i]));
                        break;
                    }
                }
            }
            return set.size();
        }
        return -1;
    }
}
