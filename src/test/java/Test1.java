import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {
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

}