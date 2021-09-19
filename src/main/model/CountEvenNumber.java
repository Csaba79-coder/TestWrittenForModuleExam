package main.model;

public class CountEvenNumber {

    public static int countEvenNumbers(int[] numbers) {
        int counter = 0;
        if (numbers != null && numbers.length > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    counter++;
                }
            }
            return counter;
        }
        return -1;
    }
}
