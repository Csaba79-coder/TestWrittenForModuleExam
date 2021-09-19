package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class GetLastNumberTest {

    @Test
    public void getLastNumberTestPos() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayPos);
        Assert.assertEquals(5, result);
    }

    @Test
    public void getLastNumberTestNeg() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayNeg);
        Assert.assertEquals(-5, result);
    }

    @Test
    public void getLastNumberTestEmpty() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayEmpty);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getLastNumberTestNullArr() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayNull);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getLastNumberTestMinusOne() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayMinusOne);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void getLastNumberTestDecreasingNums() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayDecreasing);
        Assert.assertEquals(3, result);
    }

    @Test
    public void getLastNumberTestRandomOrder() {
        int result = GetLastNumber.getLastNumber(Processor.testArrayRandomOrder);
        Assert.assertEquals(-128, result);
    }
}
