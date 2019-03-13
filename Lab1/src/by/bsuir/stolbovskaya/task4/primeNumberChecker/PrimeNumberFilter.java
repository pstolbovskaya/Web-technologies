package by.bsuir.stolbovskaya.task4.primeNumberChecker;

import java.util.*;

public class PrimeNumberFilter {

    public static Integer[] FindPrimeNumbers(int[] givenArray) throws Exception {

        CheckData(givenArray);

        List<Integer> primeNumberList = new ArrayList<>();

        for (int aGivenArray : givenArray) {
            if (IsPrime(aGivenArray)) {
                primeNumberList.add(aGivenArray);
            }
        }

        return primeNumberList.toArray(new Integer[0]);
    }

    private static boolean IsPrime(int number){

        int temp = (int)Math.sqrt(number);

        for(int i = 2; i <= temp; i++){
            if (number % i == 0){
                return false;
            }
        }

        return number > 1;
    }

    private static void CheckData(int[] givenArray) throws Exception{
        if (givenArray == null){
            throw new NullPointerException();
        }
    }
}
