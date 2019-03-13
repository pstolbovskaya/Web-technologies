package by.bsuir.stolbovskaya.task7.shellSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void sort() throws Exception {
        double[] test = new double[]{1, 2, 3, 4, 5, 6};

        assertArrayEquals(test, ShellSort.Sort(test), 0.0001);
    }

    @Test
    public void sort2() throws Exception {
        double[] test = new double[]{1, 5, 3, 4, 5, 3};
        double[] expected = new double[]{1, 3, 3, 4, 5, 5};

        assertArrayEquals(expected, ShellSort.Sort(test), 0.0001);
    }
}