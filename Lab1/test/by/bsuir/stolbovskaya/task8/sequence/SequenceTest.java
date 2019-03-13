package by.bsuir.stolbovskaya.task8.sequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {

    @Test
    public void generateOrder() throws Exception {
        double[] sequence1 = new double[]{10, 11};
        double[] sequence2 = new double[]{1, 2};

        int[] expected = new int[]{0, 1};

        assertArrayEquals(expected, Sequence.GenerateOrder(sequence1,sequence2));
    }
    @Test
    public void generateOrder2() throws Exception {
        double[] sequence1 = new double[]{10, 11};
        double[] sequence2 = new double[]{1, 2};

        int[] expected = new int[]{2, 3};

        assertArrayEquals(expected, Sequence.GenerateOrder(sequence2,sequence1));
    }
    @Test
    public void generateOrder3() throws Exception {
        double[] sequence1 = new double[]{1, 2, 2, 4, 5};
        double[] sequence2 = new double[]{2, 3, 5, 6};

        int[] expected = new int[]{3, 4, 7, 8};

        assertArrayEquals(expected, Sequence.GenerateOrder(sequence1,sequence2));
    }
}