package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class FindNumberTest {

    @Test
    public void findNumberTestPosArraySuccessful() {
        int result = FindNumber.findNumber(Processor.testArrayPos, 5);
        Assert.assertEquals(5, result);
    }

   @Test
   public void findNumberTestPosArrayUnsuccessful() {
        int result = FindNumber.findNumber(Processor.testArrayPos, 100);
        Assert.assertEquals(-1, result);
   }

    @Test
    public void findNumberTestNegArraySuccessful() {
        int result = FindNumber.findNumber(Processor.testArrayNeg, -5);
        Assert.assertEquals(-5, result);
    }

    @Test
    public void findNumberTestNegArrayUnsuccessful() {
        int result = FindNumber.findNumber(Processor.testArrayNeg, -100);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findNumberTestEmptyArray() {
        int result = FindNumber.findNumber(Processor.testArrayEmpty, -5);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findNumberTestNullArray() {
        int result = FindNumber.findNumber(Processor.testArrayNull, -100);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findNumberTestMinusOne() {
        int result = FindNumber.findNumber(Processor.testArrayMinusOne, -1);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findNumberTestMinusOneNotFound() {
        int result = FindNumber.findNumber(Processor.testArrayMinusOne, -100);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findNumberTestDecreasing() {
        int result = FindNumber.findNumber(Processor.testArrayDecreasing, 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void findNumberTestDecreasingNotFound() {
        int result = FindNumber.findNumber(Processor.testArrayDecreasing, 10);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findNumberTestRandomOrder() {
        int result = FindNumber.findNumber(Processor.testArrayRandomOrder, 167998);
        Assert.assertEquals(167998, result);
    }

    @Test
    public void findNumberTestRandomOrderNotFound() {
        int result = FindNumber.findNumber(Processor.testArrayRandomOrder, Integer.MAX_VALUE);
        Assert.assertEquals(-1, result);
    }
}
