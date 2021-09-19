package main.model;

public class MatrixTopLeftNumber {

    public static int getTopLeftNumber(int[][] matrix) {
        if (matrix[0] != null && matrix[1] != null && matrix[0].length > 0 && matrix[1].length > 0) {
            return matrix[0][0];
        }
        return -1;
    }
}
