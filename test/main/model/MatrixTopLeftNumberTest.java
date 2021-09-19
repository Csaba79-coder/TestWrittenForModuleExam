package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTopLeftNumberTest {

    @Test
    public void getTopLeftNumberTest() {
        int result = MatrixTopLeftNumber.getTopLeftNumber(Processor.matrixToTest);
        Assert.assertEquals(1, result);
    }

    // from these 2 tests if one is empty or one is null returns the same good result in test!

    @Test
    public void getTopLeftNumberTestNull() {
        int[][] matrixToTest = {Processor.testArrayNull, Processor.testArrayNull};
        int result = MatrixTopLeftNumber.getTopLeftNumber(matrixToTest);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getTopLeftNumberTestEmpty() {
        int[][] matrixToTest = {Processor.testArrayEmpty, Processor.testArrayEmpty};
        int result = MatrixTopLeftNumber.getTopLeftNumber(matrixToTest);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getTopLeftNumbersTestOneElementInFirstArrayOfMatrix() {
        int[][] matrixToTest = {Processor.testArrayMinusOne, Processor.testArrayRandomOrder};
        int result = MatrixTopLeftNumber.getTopLeftNumber(matrixToTest);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getTopLeftNumbersTestFirstArrayHasZeroElement() {
        int[][] matrixToTest = {{0}, Processor.testArrayDecreasing};
        int result = MatrixTopLeftNumber.getTopLeftNumber(matrixToTest);
        Assert.assertEquals(0, result);
    }
}
