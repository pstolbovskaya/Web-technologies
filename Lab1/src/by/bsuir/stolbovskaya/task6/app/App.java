package by.bsuir.stolbovskaya.task6.app;

import by.bsuir.stolbovskaya.task6.matrix.Matrix;

public class App {

    public static void main(String[] args) throws Exception {

        double[] array = new double[]{1.2, 1.3, 1.4, 1.5, 1.6};
        double[][] matrix = Matrix.GetMatrix(array);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print('\n');
        }

    }

}
