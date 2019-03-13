package by.bsuir.stolbovskaya.task8.app;

import by.bsuir.stolbovskaya.task8.sequence.Sequence;

public class App {

    public static void main(String[] args) throws Exception {

        double[] array1 = new double[]{1, 1, 3, 4, 7, 10, 20};
        double[] array2 = new double[]{1, 5, 5, 6, 8, 10, 11, 21, 22};

        int[] res = Sequence.GenerateOrder(array1, array2);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
