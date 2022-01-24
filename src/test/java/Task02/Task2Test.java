package Task02;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Task2Test extends TestCase {
    private Task2 task2 = new Task2();

    @Test
    public void test1UnionArrays() {
        int[] firstArray = {1, 3, 4};
        int[] secondArray = {1, 2, 6};
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 6}, task2.unionArrays(firstArray, secondArray));
    }

    @Test
    public void test2UnionArrays() {
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {2, 5, 10};
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 10}, task2.unionArrays(firstArray, secondArray));
    }

    @Test
    public void test3UnionArrays() {
        int[] firstArray = {1, 3, 2};
        int[] secondArray = {1, 2, 3};
        boolean thrown = false;
        try {
            task2.unionArrays(firstArray, secondArray);
        } catch (ArrayStoreException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}