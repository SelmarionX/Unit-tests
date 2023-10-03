import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    void evenOddNumberTrue() {
        boolean t = Main.evenOddNumber(8);
        assertTrue(t);

    }
    @Test
    void evenOddNumberFalse() {
        boolean f = Main.evenOddNumber(7);
        assertFalse(f);
    }

    @Test
    void numberInIntervalTrue() {
        boolean t = Main.numberInInterval(30);
        assertTrue(t);
    }

    @Test
    void numberInIntervalFalse() {
        boolean f = Main.numberInInterval(10);
        assertFalse(f);
    }
}