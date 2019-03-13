package by.bsuir.stolbovskaya.task4.primeNumberChecker;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberFilterTest {

    @Test
    public void findNoPrimeNumbers() throws Exception {
        int[] test = new int[]{1, -1, -34, 4, 6};
        Integer[] expected = new Integer[]{};

        assertArrayEquals(expected,PrimeNumberFilter.FindPrimeNumbers(test));
    }

    @Test
    public void findPrimeNumbers() throws Exception {
        int[] test = new int[]{0, 1, 3, 31, 113, 114};
        Integer[] expected = new Integer[]{3, 31, 113};

        assertArrayEquals(expected,PrimeNumberFilter.FindPrimeNumbers(test));
    }

}