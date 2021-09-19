package main.model;

public class DiagonalDifferenceOfMatrix {

    public static int getDiagonalDifference(int[][] matrix) {
        if (matrix[0] != null && matrix[1] != null && matrix[0].length >0 && matrix[1].length > 0 && matrix[0].length == matrix[1].length) {
            // first diagonal is situated on the same indexes (I mean both indexes are the same!) e.g.: [0][0]; [1][1], [2][2]
            // second diagonal is situated indexOfRow = (array.length - 1) - indexOfColumn
            int diagonal1 = 0;
            int diagonal2 = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i == j) {
                        diagonal1 += matrix[i][j];
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i == matrix.length - 1 - j) {
                        diagonal2 += matrix[i][j];
                    }
                }
            }
            return Math.abs(diagonal1 - diagonal2);
        }
        return -1;
    }
}
