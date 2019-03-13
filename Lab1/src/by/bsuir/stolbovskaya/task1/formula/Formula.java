package by.bsuir.stolbovskaya.task1.formula;

import static java.lang.Math.*;

public class Formula {

    public static double Calculate(double x, double y){

        double subfraction = 2 * x / (1 + pow(x * y, 2));
        return ((1 + sin(x + y))
                / (2 + abs(x - subfraction)) + x);
    }
}
