package by.bsuir.stolbovskaya.task9.classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void addBall() {
        Ball ball = new Ball("red", 1.2);
        Basket basket = new Basket();

        basket.AddBall(ball);

        assertEquals(ball, basket.GetBalls().get(0));
    }

    @Test
    public void getWeight() {
        Ball ball = new Ball("red", 1.2);
        Ball ball2 = new Ball("blue", 1.0);

        Basket basket = new Basket();

        basket.AddBall(ball);
        basket.AddBall(ball2);

        assertEquals(2.2, basket.GetWeight(), 0.001);
    }

    @Test
    public void countBlueBalls() {
        Ball ball = new Ball("red", 1.2);
        Ball ball2 = new Ball("blue", 1.0);

        Basket basket = new Basket();

        basket.AddBall(ball);
        basket.AddBall(ball2);

        assertEquals(1, basket.CountBlueBalls());
    }
}