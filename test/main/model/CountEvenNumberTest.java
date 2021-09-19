package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class CountEvenNumberTest {

    @Test
    public void countEvenNumbersTestArrayPos() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayPos);
        Assert.assertEquals(2, result);
    }

    @Test
    public void countEvenNumberTestArrayNeg() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayNeg);
        Assert.assertEquals(2, result);
    }

    @Test
    public void countEvenNumTestArrayEmpty() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayEmpty);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void countEvenNumTestArrayNull() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayNull);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void countEvenNumTestArrayMinusOne() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayMinusOne);
        Assert.assertEquals(0, result);
    }

    @Test
    public void countEvenNumTestArrayDecreasing() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayDecreasing);
        Assert.assertEquals(1, result);
    }

    @Test
    public void countEvenNumTestArrayRandomOrder() {
        int result = CountEvenNumber.countEvenNumbers(Processor.testArrayRandomOrder);
        Assert.assertEquals(4, result);
    }

    @Test
    public void countEvenNumTestArrayZero() {
        int[] testArrZero = {0};
        int result = CountEvenNumber.countEvenNumbers(testArrZero);
        Assert.assertEquals(1, result);
    }
}
