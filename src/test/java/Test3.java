import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3 {
    static Exercises1 handle;

    @BeforeAll
    static void setUp() {
        handle = new Exercises1();
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