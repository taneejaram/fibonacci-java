package test.java;

import main.java.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void firstFiveFibonacciNumbers() {
        long[] actual = Fibonacci.sequence(10);
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, actual);
    }
}
