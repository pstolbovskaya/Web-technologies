package by.bsuir.stolbovskaya.task2.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void containsPoint60() {
        final boolean expectedresult = true;
        assertEquals(expectedresult, Area.ContainsPoint(6,0));
    }
}