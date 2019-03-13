package by.bsuir.stolbovskaya.task3.function;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void calculate_PI_check() {

        Function func = new Function();
        try {
            func.Calculate(2, 0, 1);
        } catch (Exception e) {
            assertEquals("wrong line segment a < b", e.getMessage());
        }
    }

    @Test
    public void calculate_PIdevide2_check() {

        Function func = new Function();
        try {
            func.Calculate(0, 1, 0);
        } catch (Exception e) {
            assertEquals("wrong h", e.getMessage());
        }
    }

    @Test
    public void calculate_PI() {

        Function func = new Function();
        try {

            double[][] result = func.Calculate(Math.PI, Math.PI, 1);
            assertEquals(0, result[0][1], 0.00001);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}