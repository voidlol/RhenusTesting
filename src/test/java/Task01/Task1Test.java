package Task01;

import junit.framework.TestCase;
import org.junit.Test;

public class Task1Test extends TestCase {

    Task1 task1 = new Task1();

    @Test
    public void test1CalcSumOfMissingNumbers() {
        int[] testArray = {1, 3, 4, 6};
        assertEquals(7, task1.calcSumOfMissingNumbers(testArray));
    }

    @Test
    public void test2CalcSumOfMissingNumbers() {
        int[] testArray = {45, 48};
        assertEquals(93, task1.calcSumOfMissingNumbers(testArray));
    }

    @Test
    public void test3CalcSumOfMissingNumbers() {
        int[] testArray = {1, 2, 3};
        assertEquals(0, task1.calcSumOfMissingNumbers(testArray));
    }
}