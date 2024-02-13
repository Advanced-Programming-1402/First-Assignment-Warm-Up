import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercises1Test {
    static Exercises1 handle;

    @BeforeAll
    static void setUp() {
        handle = new Exercises1();
    }

    @Test
    void factorial0() {
        assertEquals(1, handle.factorial(0));
    }

    @Test
    void factorial1() {
        assertEquals(720, handle.factorial(6));
    }

    @Test
    void factorial2() {
        assertEquals(6, handle.factorial(3));
    }

    @Test
    void fibonacciSample1() {
        assertEquals(5, handle.fibonacci(5));
    }

    @Test
    void fibonacciSample2() {
        assertEquals(1, handle.fibonacci(1));
    }

    @Test
    void fibonacciSample3() {
        assertEquals(1, handle.fibonacci(2));
    }

    @Test
    void fibonacciBigIndex() {
        // It's actually a prime number
        assertEquals(2971215073L, handle.fibonacci(47));
    }
    @Test
    public void testGenerateTriangleWithThreeRows() {
        char[][] expectedTriangle = {
                {'*'},
                {'*', '*'},
                {'*', '*', '*'}
        };
        assertArrayEquals(expectedTriangle, handle.generateTriangle(3));
    }

    @Test
    public void testGenerateTriangleWithFiveRows() {
        char[][] expectedTriangle = {
                {'*'},
                {'*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };
        assertArrayEquals(expectedTriangle, handle.generateTriangle(5));
    }

    @Test
    public void testGenerateTriangleWithZeroRows() {
        char[][] expectedTriangle = {};
        assertArrayEquals(expectedTriangle, handle.generateTriangle(0));
    }
}