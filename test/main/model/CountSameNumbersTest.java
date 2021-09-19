package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class CountSameNumbersTest {

    int[] oneArr = {1, 2, 3, 4};
    int[] twoArr = {2, 3, 4, 1};
    int[] allNumSameOneArr = {10, 10, 10};
    int[] allNumSamTwoArr = {10, 10, 10, 10, 10, 10};
    int[] allNumSameSameLongArr = {10, 10, 10};

    @Test
    public void countSameNumbersTestBothArrayNull() {
        int result = CountSameNumbers.countSameNumbers(null, null);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void countSameNumbersTestOneArrayNull() {
        int result = CountSameNumbers.countSameNumbers(Processor.testArrayNull, Processor.testArrayPos);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void countSameNumbersTestAllNumsAreSame() {
        int result = CountSameNumbers.countSameNumbers(oneArr, twoArr);
        Assert.assertEquals(4, result);
    }

    @Test
    public void CountSameNumbersTestSomeIsSame() {
        int result = CountSameNumbers.countSameNumbers(Processor.firstNumbers, Processor.secondNumbers);
        Assert.assertEquals(2, result);
    }

    @Test
    public void CountSameNumbersTestAllNumSame() {
        int result = CountSameNumbers.countSameNumbers(allNumSameOneArr, allNumSamTwoArr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void CountSameNumbersTestAllNumSameAndSameLength() {
        int result = CountSameNumbers.countSameNumbers(allNumSameOneArr, allNumSameSameLongArr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void CountSameNumbersTestEmpty() {
        int result = CountSameNumbers.countSameNumbers(Processor.testArrayEmpty, oneArr);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void CountSameNumbersTestBothEmpty() {
        int result = CountSameNumbers.countSameNumbers(Processor.testArrayEmpty, Processor.testArrayEmpty);
        Assert.assertEquals(-1, result);
    }
}
