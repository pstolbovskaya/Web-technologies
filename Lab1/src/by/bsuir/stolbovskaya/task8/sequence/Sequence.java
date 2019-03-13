package by.bsuir.stolbovskaya.task8.sequence;

public class Sequence {

    public static int[] GenerateOrder(double[] sequence1, double[] sequence2) throws Exception {

        CheckData(sequence1);
        CheckData(sequence2);

        int[] result = new int[sequence2.length];
        //k - result position
        int k = 0;

        int currPos = 0;
        int j = 0;
        while (j < sequence2.length){
            if (sequence1[currPos] <= sequence2[j]){
                if(currPos < sequence1.length - 1){
                    currPos++;
                    k++;
                } else{
                    k++;
                    for(int i = j; i < result.length; i++){
                        result[i] = k;
                        k++;
                    }
                    break;
                }
            } else{
                result[j] = k;
                j++;
                k++;
            }
        }

        return result;
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
