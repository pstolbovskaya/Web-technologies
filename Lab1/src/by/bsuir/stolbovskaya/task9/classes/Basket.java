package by.bsuir.stolbovskaya.task9.classes;

import java.util.ArrayList;
import by.bsuir.stolbovskaya.task9.classes.Ball;

public class Basket {

    private ArrayList<Ball> balls;

    public boolean AddBall(Ball ball){
      //  if (ball == null){
         //   throw  new NullPointerException();
        //}

        return balls.add(ball);
    }

    public Basket(){
        balls = new ArrayList<>();
    }
    
    public double GetWeight(){
        double weight = 0;
        for (Ball currentBall : balls) {
            if (currentBall!=null)
            weight += currentBall.GetWeight();
        }

        return weight;
    }

    public int CountBlueBalls(){
        int count = 0;
        for (Ball currentBall : balls) {
            if (currentBall.GetColor().compareTo("blue") == 0){
                count++;
            }
        }

        return count;
    }

    public ArrayList<Ball> GetBalls(){
        return balls;
    }

    public void AddBalls(ArrayList<Ball> newBalls){
        for (Ball ball: newBalls) {
            balls.add(ball);
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + " { balls: " + balls.toString() + "}";
    }
}
