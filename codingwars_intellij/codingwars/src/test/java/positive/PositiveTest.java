package positive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositiveTest {

    @Test
    void sumAlternative() {
        assertEquals(15, Positive.sumAlternative(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sumAlternative(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sumAlternative(new int[]{}));
        assertEquals(0, Positive.sumAlternative(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sumAlternative(new int[]{-1,2,3,4,-5}));
    }

    @Test
    void sum() {
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    }

    @Test
    void sumMath() {
        assertEquals(15, Positive.sumMath(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sumMath(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sumMath(new int[]{}));
        assertEquals(0, Positive.sumMath(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sumMath(new int[]{-1,2,3,4,-5}));
    }
}