package by.bsuir.stolbovskaya.task3.app;

import by.bsuir.stolbovskaya.task3.function.Function;

public class App {

    public static void main(String[] args){

        double a = 0;
        double b = Math.PI;
        double h = Math.PI / 4;

        Function func = new Function();

        try {

            double[][] result = func.Calculate(0, Math.PI, Math.PI / 4);
            int len = result.length;

            for (int i = 0; i < len; i++) {
                System.out.format("%3d. %+5.4f %+6.3f\n",(i+1),result[i][0], result[i][1]);
            }

        } catch (Exception e){

            System.out.print(e.getMessage());
        }
    }
}
