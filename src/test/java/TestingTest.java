import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestingTest {
    @Test
    void add() {
        assertEquals(3, Testing.add(1, 2));
    }

    @Test
    void isGerade() {
        assertTrue(Testing.isGerade(1));
    }

    @Test
    void multiply() {
        assertEquals(2, Testing.multiply(1, 2));
    }

    @Test
    void toUpperCase() {
        assertEquals("HELLO", Testing.toUpperCase("hello"));
    }

    @Test
    void isPositive() {
        assertTrue(Testing.isPositive(1));
    }
}