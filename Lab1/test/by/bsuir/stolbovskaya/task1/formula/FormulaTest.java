package by.bsuir.stolbovskaya.task1.formula;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaTest {

    @Test
    public void calculate() {

        final double delta = 0.00001;
        final double expectedresult = 0.5;

        assertEquals(expectedresult, Formula.Calculate(0,0), delta );
    }
}