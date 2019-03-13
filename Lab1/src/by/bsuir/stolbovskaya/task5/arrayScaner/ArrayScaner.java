package by.bsuir.stolbovskaya.task5.arrayScaner;

public class ArrayScaner {

    public static int CountNumbersToRemove (int[] numbers){

        if(numbers == null || numbers.length == 1 || numbers.length == 0){
            return 0;
        }

        int[] seqMaxcount = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            seqMaxcount[i] = 1;
            for(int j = 0; j < i; j++){
                if (numbers[j] < numbers[i]){
                    seqMaxcount[i] = Math.max(seqMaxcount[i], seqMaxcount[j] + 1);
                }
            }
        }

        int max = 0;
        for (int k = 0; k < seqMaxcount.length; k++){
            if (max < seqMaxcount[k]){
                max = seqMaxcount[k];
            }
        }

        return numbers.length - max;
    }
}
