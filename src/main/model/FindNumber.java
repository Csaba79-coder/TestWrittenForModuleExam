package main.model;

public class FindNumber {

    public static int findNumber(int[] numbers, int number) {
        if (numbers != null && numbers.length > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == number) {
                    return number;
                }
            }
        }
        return -1;
    }
}
