package HW03.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {
    @Test
    void evenOddNumberTrue() {
        boolean t = Main.evenOddNumber(8);
        assertEquals(t, true);

    }
    @Test
    void evenOddNumberFalse() {
        boolean f = Main.evenOddNumber(13);
        assertEquals(f, false);
    }

    @Test
    void numberInIntervalTrue() {
        boolean t = Main.numberInInterval(45);
        assertEquals(t, true);
    }

    @Test
    void numberInIntervalFalse() {
        boolean f = Main.numberInInterval(101);
        assertEquals(f, false);
    }
}
