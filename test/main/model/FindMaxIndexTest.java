package main.model;

import main.module.Processor;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxIndexTest {

    @Test
    public void findMaxIndexTestHasMaxValue() {
        int result = FindMaxIndex.findMaxIndex(Processor.secondNumbers);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findMaxIndexTestNullArray() {
        int result = FindMaxIndex.findMaxIndex(Processor.testArrayNull);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findMaxIndexTestEmptyArray() {
        int result = FindMaxIndex.findMaxIndex(Processor.testArrayEmpty);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void findMaxIndexTestAllNumsAreSame() {
        int[] arrayToTest = {1, 1, 1, 1, 1, 1};
        int result = FindMaxIndex.findMaxIndex(arrayToTest);
        Assert.assertEquals(0, result);
    }

    @Test
    public void findMaxIndexTestOneElement() {
        int result = FindMaxIndex.findMaxIndex(Processor.testArrayMinusOne);
        Assert.assertEquals(0, result);
    }
}
