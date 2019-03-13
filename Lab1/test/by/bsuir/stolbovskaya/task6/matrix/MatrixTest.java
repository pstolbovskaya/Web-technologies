package by.bsuir.stolbovskaya.task6.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void getMatrix() throws Exception {
        double[] test = new double[]{1, 2};
        double[][] expected = new double[][]{{1, 2}, {2, 1}};

        assertEquals(expected, Matrix.GetMatrix(test));
    }

    @Test
    public void NullPointer(){
        try{
            Matrix.GetMatrix(null);
        } catch (Exception e){
            assertTrue(e.getClass() == NullPointerException.class);
        }
    }
}