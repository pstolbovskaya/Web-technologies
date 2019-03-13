package by.bsuir.stolbovskaya.task7.app;

import by.bsuir.stolbovskaya.task7.shellSort.ShellSort;

public class App {

    public static void main(String[] args) throws Exception {

        double[] array = new double[]{2, 4, 3, 6, 1};

        double[] sortedarray = ShellSort.Sort(array);

        for(int i = 0; i < sortedarray.length; i++){
            System.out.print(sortedarray[i] + " ");
        }
    }

}
