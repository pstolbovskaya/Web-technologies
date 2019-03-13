package by.bsuir.stolbovskaya.task5.app;

import by.bsuir.stolbovskaya.task5.arrayScaner.ArrayScaner;

public class App {

    public static void main(String[] args) throws Exception {

        int[] array = new int[]{1, 2, 3, 10, 9, 5, 6, 7, 8, 5, 6};

        int count = ArrayScaner.CountNumbersToRemove(array);

        System.out.print(count);
    }
}
