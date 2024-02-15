import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2 {
    static Exercises1 handle;

    @BeforeAll
    static void setUp() {
        handle = new Exercises1();
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

}