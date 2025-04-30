package solid3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Smell1AlmostBestTest {

// Boundary Test Cases:
    @Test
    void testPowZero() {
        assertEquals(1, Smell1AlmostBest.toPower(99, 0));
    }

    @Test
    void testPowOne() {
        assertEquals(99, Smell1AlmostBest.toPower(99, 1));
    }

    @Test
    void testZeroBaseZeroPow() {
        assertEquals(1, Smell1AlmostBest.toPower(0, 0));
    }

// Negative Test Case:
    @Test
    void testNegativePow() {
        assertEquals(1, Smell1AlmostBest.toPower(2, -2)); 
    }

// Equivalence Test Cases:
    @Test
    void testPositivePow() {
        assertEquals(9801, Smell1AlmostBest.toPower(99, 2));
    }

    @Test
    void testZeroBasePositivePow() {
        assertEquals(0, Smell1AlmostBest.toPower(0, 99));
    }

    @Test
    void testOneBaseAnyPow() {
        assertEquals(1, Smell1AlmostBest.toPower(1, 100));
    }

    @Test
    void testNegativeBaseEvenPow() {
        assertEquals(16, Smell1AlmostBest.toPower(-2, 4));
    }

    @Test
    void testNegativeBaseOddPow() {
        assertEquals(-8, Smell1AlmostBest.toPower(-2, 3));
    }

}
