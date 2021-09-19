package main.model;

public class FindMaxIndex {

    // this one gives back the position of the first largest value!

    public static int findMaxIndex(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1; // null or empty
        }

        int largest = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[largest]) {
                largest = i;
            }
        }
        return largest; // position of the first largest found
    }
}

