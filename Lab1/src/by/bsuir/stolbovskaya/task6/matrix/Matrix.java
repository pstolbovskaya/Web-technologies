package by.bsuir.stolbovskaya.task6.matrix;

public class Matrix {

    public static double[][] GetMatrix(double[] array) throws Exception {

        CheckData(array);

        double[][] result = new double[array.length][array.length];

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){

                if (i + j < array.length){
                    result[i][j] = array[i + j];
                } else {
                    result[i][j] = array[i + j - array.length];
                }
            }
        }

        return result;
    }

    private static void CheckData(double[] numbers) throws Exception{
        if (numbers == null){
            throw new NullPointerException();
        }
        if (numbers.length == 0){
            throw new Exception("no data in array");
        }
    }
}
