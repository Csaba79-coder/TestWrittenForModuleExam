package main.model;

public class GetLastNumber {

    public static int getLastNumber(int[] numbers) {
        if (numbers != null && numbers.length > 0) {
            return numbers[numbers.length - 1];
        }
        return -1;
    }
}
