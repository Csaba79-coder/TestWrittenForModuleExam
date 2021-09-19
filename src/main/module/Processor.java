package main.module;

import main.model.*;

public class Processor {

    public static int[] testArrayPos = {1, 2, 3, 4, 5};
    public static int[] testArrayNeg = {-1, -2, -3, -4, -5};
    public static int[] testArrayEmpty = {};
    public static int[] testArrayNull = null;
    public static int[] testArrayMinusOne = {-1};
    public static int[] testArrayDecreasing = {5, 4, 3};
    public static int[] testArrayRandomOrder = {10, 100, -1, 167998, -128};
    public static int[] firstNumbers = {0, 1, 2, 3, 4};
    public static int[] secondNumbers = {5, 6, 5, 4, 4, 4, 3};
    public static int[][] matrixToTest = {{1, 2, 3}, {4, 5, 6}};
    public static int[][] matrixDiagonal = {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}};

    public void run() {
        int lastNumb = GetLastNumber.getLastNumber(testArrayPos);
        System.out.println("The last num of array is: " + lastNumb);

        int evenNum = CountEvenNumber.countEvenNumbers(testArrayRandomOrder);
        System.out.println("The amount of even numbers in array is: " + evenNum);

        int findNum = FindNumber.findNumber(testArrayDecreasing, 5);
        System.out.println("The number in your array is: " + findNum);
        int notFoundNum = FindNumber.findNumber(testArrayDecreasing, 100);
        System.out.println("There is no such number " + notFoundNum);
        int pcsOfSameNums = CountSameNumbers.countSameNumbers(testArrayDecreasing, testArrayPos);
        System.out.println("The number of same numbers in array are: " + pcsOfSameNums);

        int sameNums = CountSameNumbers.countSameNumbers(firstNumbers, secondNumbers);
        System.out.println(sameNums);

        int maxIndex = FindMaxIndex.findMaxIndex(secondNumbers);
        System.out.println(maxIndex);
        int maxIndexMinusOne = FindMaxIndex.findMaxIndex(testArrayMinusOne);
        System.out.println(maxIndexMinusOne);

        int firstNumOfFirstMatrix = MatrixTopLeftNumber.getTopLeftNumber(matrixToTest);
        System.out.println("The first number of the first array of the matrix is as follows: " + firstNumOfFirstMatrix);

        int diagonalDifferenceOfMatrix = DiagonalDifferenceOfMatrix.getDiagonalDifference(matrixDiagonal);
        System.out.println("The difference of matrix's diagonal: " + diagonalDifferenceOfMatrix);
    }
}
