package Task04;

import junit.framework.TestCase;
import org.junit.Test;

public class Task4Test extends TestCase {

    @Test
    public void test1AverageWordLength() {
        Task4 task4 = new Task4();
        String input = "Я хорошо знаю javascript";
        double expected = 5.25;
        assertEquals(expected, task4.averageWordLength(input));
    }

    @Test
    public void test2AverageWordLength() {
        Task4 task4 = new Task4();
        String input = "Я хорошо знаю javascript";
        task4.averageWordLength(input);
        input = "Но некоторые вопросы вызывают трудности, например замыкания.";
        double expected = 6.64;
        assertEquals(expected, task4.averageWordLength(input));
    }




}