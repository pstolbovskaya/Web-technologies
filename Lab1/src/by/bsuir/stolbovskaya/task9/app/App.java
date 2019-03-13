package by.bsuir.stolbovskaya.task9.app;

import by.bsuir.stolbovskaya.task9.classes.Ball;
import by.bsuir.stolbovskaya.task9.classes.Basket;

public class App {

    public static void main(String[] args) {

        Ball redBall = new Ball("red", 2.3);
        Ball blueBall = new Ball("blue", 2.0);
        Ball someball = null;
        Basket basket = new Basket();

        basket.AddBall(redBall);
        basket.AddBall(blueBall);
        basket.AddBall(someball);
        basket.GetBalls();
        basket.GetWeight();

        System.out.print(basket.toString());
    }
}
