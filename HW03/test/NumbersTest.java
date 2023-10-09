package HW03.test;

import HW03.Numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {
    @Test
    void evenOddNumberTrue() {
        boolean t = Numbers.evenOddNumber(8);
        assertEquals(t, true);

    }
    @Test
    void evenOddNumberFalse() {
        boolean f = Numbers.evenOddNumber(13);
        assertEquals(f, false);
    }

    @Test
    void numberInIntervalTrue() {
        boolean t = Numbers.numberInInterval(45);
        assertEquals(t, true);
    }

    @Test
    void numberInIntervalFalse() {
        boolean f = Numbers.numberInInterval(101);
        assertEquals(f, false);
    }
}
