package Task03;

import junit.framework.TestCase;
import org.junit.Test;

public class Task3Test extends TestCase {
    Task3 task3 = new Task3();

    @Test
    public void test1GetAverageScore() {
        int[] votes = {0, 2, 0, 1, 23};
        Task3.Score expected = new Task3.Score(4.73, "\"*****\"");
        assertEquals(expected, task3.getAverageScore(votes));
    }

    @Test
    public void test2GetAverageScore() {
        int[] votes = {16, 17, 23, 40, 45};
        Task3.Score expected = new Task3.Score(3.57, "\"****\"");
        assertEquals(expected, task3.getAverageScore(votes));
    }

    @Test
    public void test3GetAverageScore() {
        int[] votes = {55, 67, 98, 115, 61};
        Task3.Score expected = new Task3.Score(3.15, "\"***\"");
        assertEquals(expected, task3.getAverageScore(votes));
    }
}