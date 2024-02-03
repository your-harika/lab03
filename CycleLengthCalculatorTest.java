import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static junit.framework.TestCase.assertEquals;

public class CycleLengthCalculatorTest
{
    @Test
    public void testEvenRangeEvenStart(){
        int i = 2;
        int j = 10;
        int expected = 20;
        int actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);
    }

    @Test
    public void testOddRangeOddStart(){
        int i = 11;
        int j = 21;
        int expected = 21;
        int actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);
    }

    @Test
    public void testMixedRange() {
        int i = 201;
        int j = 210;
        int expected = 89;
        int actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumber() {
        int i = 1;
        int j = 1;
        int expected = 1;
        int actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeRange() {
        int i = 900;
        int j = 1000;
        int expected = 174;
        int actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCases() {
        int i = 1000000;
        int j = 1000000;
        int expected = 153;
        int actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);

        i = 1;
        j = 999999;
        expected = 525;
        actual = CycleLengthCalculator.findMaxCycleLength(i, j);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidCases(){
        int i = -1;
        int j = -10;
        int finalI = i;
        int finalJ = j;
        assertThrows(IllegalArgumentException.class, () -> CycleLengthCalculator.findMaxCycleLength(finalI, finalJ));

        i = 1000001;
        j = 1000002;
        int finalI1 = i;
        int finalJ1 = j;
        assertThrows(IllegalArgumentException.class, () -> CycleLengthCalculator.findMaxCycleLength(finalI1, finalJ1));

        i = 0;
        j = 10;
        int finalI2 = i;
        int finalJ2 = j;
        assertThrows(IllegalArgumentException.class, () -> CycleLengthCalculator.findMaxCycleLength(finalI2, finalJ2));

    }

}
