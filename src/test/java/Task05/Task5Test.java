package Task05;

import junit.framework.TestCase;
import org.junit.Test;

public class Task5Test extends TestCase {

    Task5 task5 = new Task5();

    @Test
    public void test1TotalPaths() {
        int expected = 1;
        assertEquals(expected, task5.totalPaths(0, 1));
    }

    @Test
    public void test2TotalPaths() {
        int expected = 2;
        assertEquals(expected, task5.totalPaths(1, 1));
    }

    @Test
    public void test3TotalPaths() {
        int expected = 6;
        assertEquals(expected, task5.totalPaths(2, 2));
    }

    @Test
    public void test4TotalPaths() {
        int expected = 10;
        assertEquals(expected, task5.totalPaths(3, 2));
    }
}
