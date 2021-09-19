package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class DiagonalDifferenceOfMatrixTest {

    @Test
    public void getDiagonalDifferenceTest() {
        int result = DiagonalDifferenceOfMatrix.getDiagonalDifference(Processor.matrixDiagonal);
        Assert.assertEquals(0, result);
    }

    @Test
    public void getDiagonalDifferenceTestNull() {
        int[][] matrixToTest = {Processor.testArrayNull, Processor.testArrayNull};
        int result = DiagonalDifferenceOfMatrix.getDiagonalDifference(matrixToTest);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getDiagonalDifferenceTestEmpty() {
        int[][] matrixToTest = {Processor.testArrayEmpty, Processor.testArrayEmpty};
        int result = DiagonalDifferenceOfMatrix.getDiagonalDifference(matrixToTest);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getDiagonalDifferenceTestFirstArrayHasZeroElement() {
        int[][] matrixToTest = {{0}, Processor.testArrayDecreasing};
        int result = DiagonalDifferenceOfMatrix.getDiagonalDifference(matrixToTest);
        Assert.assertEquals(-1, result);
    }
}
