package home.work.practice;

/**
 * Created by Vitalik on 10.02.2016.
 */
public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int arraySize = 0;
        for (int i=0;i<input.length;i++){
            for (int j=0; j<input[i].length; j++) {
                arraySize = arraySize +1;
            }
        }
        int[] result = new int[arraySize];

        int k=0;

        for (int i=0;i<input[0].length;i++){
            if (i%2 == 0)
                for (int j = 0; j<input.length; j++) {
                    result[k] = input[j][i];
                    k++;
                }
            else
                for (int j = input.length-1; j>-1; j--) {
                    result[k] = input[j][i];
                    k++;
                }
        }
        return result;
    }
}
