package by.bsuir.stolbovskaya.task4.app;

import by.bsuir.stolbovskaya.task4.primeNumberChecker.PrimeNumberFilter;

public class App {

    public static void main(String[] args) throws Exception {

        int[] array = new int[]{1,2,3,4,5,6,7,8,9,31};

        Integer[] primes = PrimeNumberFilter.FindPrimeNumbers(array);

        for (int i = 0; i < primes.length; i++){
            System.out.print(primes[i] + " ");
        }
    }
}
