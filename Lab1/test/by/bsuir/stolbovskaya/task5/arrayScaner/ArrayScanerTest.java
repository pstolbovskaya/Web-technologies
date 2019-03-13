package by.bsuir.stolbovskaya.task5.arrayScaner;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayScanerTest {

    @Test
    public void countNumbersToRemove() throws Exception {
        int[] test = new int[]{1, 2, 3, 10, 5};
        int count = 1;
        assertEquals(count, ArrayScaner.CountNumbersToRemove(test));
    }

    @Test
    public void NoNumbersToRemove() throws Exception {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7};
        int count = 0;
        assertEquals(count, ArrayScaner.CountNumbersToRemove(test));
    }

    @Test
    public void NullPointer(){
        int[] test = null;

        try{
            ArrayScaner.CountNumbersToRemove(test);
        } catch (Exception e){
            assertTrue(e.getClass() == NullPointerException.class);
        }
    }

    @Test
    public void countNumbersToRemove11() throws Exception {
        int[] test = new int[]{1, 2, 3, 10, 9, 5, 6, 7, 8, 5, 6};
        int count = 4;
        assertEquals(count, ArrayScaner.CountNumbersToRemove(test));
    }

    @Test
    public void countNumbersToRemove12() throws Exception {
        int[] test = new int[]{1, 2, 3, 10, 9, 5, 6, 4};
        int count = 3;
        assertEquals(count, ArrayScaner.CountNumbersToRemove(test));
    }

    @Test
    public void countNumbersToRemove13() throws Exception {
        int[] test = new int[]{10, 9, 3, 10, 5};
        int count = 3;
        assertEquals(count, ArrayScaner.CountNumbersToRemove(test));
    }

    @Test
    public void countNumbersToRemove14() throws Exception {
        int[] test = new int[]{10, 2, 3, 10, 5};
        int count = 2;
        assertEquals(count, ArrayScaner.CountNumbersToRemove(test));
    }


}