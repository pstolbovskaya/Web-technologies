package by.bsuir.stolbovskaya.task7.shellSort;

public class ShellSort {

    public static double[] Sort(double[] data) throws Exception {

        double[] array = data.clone();

        CheckData(array);

        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){

                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;

                if(i > 0) {
                    i--;
                }
            }
            else {
                i++;
            }
        }

        return array;
    }

    private static void CheckData(double[] array) throws Exception{
        if (array == null){
            throw new NullPointerException();
        }
        if (array.length == 0){
            throw new Exception("no data in array");
        }
    }
}
